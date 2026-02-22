package com.vimaltech.contactapi.controller;

import com.vimaltech.contactapi.dto.ContactRequest;
import com.vimaltech.contactapi.service.ContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/contact")
@RequiredArgsConstructor
@CrossOrigin(origins = "https://vimaltech.dev")
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<String> submitContact(
            @Valid @RequestBody ContactRequest request) {

        contactService.processContact(request);
        return ResponseEntity.ok("Message received successfully.");
    }
}