package com.hsfulda.distributedapplications1.repository;

import com.hsfulda.distributedapplications1.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    /*
    Jonas Wagner - 1315578 - 28.10.2023
     */
}
