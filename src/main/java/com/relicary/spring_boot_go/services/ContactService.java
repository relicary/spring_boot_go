package com.relicary.spring_boot_go.services;

import com.relicary.spring_boot_go.model.Contact;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ContactService {
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        // TODO: Persist in a DB Table
        log.info(contact.toString());
        return isSaved;
    }
}
