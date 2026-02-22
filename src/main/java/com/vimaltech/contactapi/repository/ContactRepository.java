package com.vimaltech.contactapi.repository;

import com.vimaltech.contactapi.entity.ContactInquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository
        extends JpaRepository<ContactInquiry, String> {

}