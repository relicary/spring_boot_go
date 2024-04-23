package com.relicary.spring_boot_go.services;

import com.relicary.spring_boot_go.model.Contact;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

@Service
@Log4j2
@Getter
@Setter
@RequestScope
public class ContactService {
    
    private int counter = 0;

    public ContactService(){
        log.info("Contact Service Bean initialized");
    }
    
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        // TODO: Persist in a DB Table
        log.info(contact.toString());
        return isSaved;
    }
}
