CREATE TABLE contact_inquiries (
                                   id VARCHAR(36) PRIMARY KEY,
                                   name VARCHAR(255) NOT NULL,
                                   email VARCHAR(255) NOT NULL,
                                   subject VARCHAR(255),
                                   message VARCHAR(1000) NOT NULL,
                                   created_at TIMESTAMP NOT NULL
);