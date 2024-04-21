package com.relicary.spring_boot_go.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

}