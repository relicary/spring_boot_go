package com.relicary.spring_boot_go.controllers;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class ContactController {

    @GetMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

    @PostMapping("/saveMsg")
    public ModelAndView saveMessage(
            @RequestParam String name,
            @RequestParam String mobileNum,
            @RequestParam String email,
            @RequestParam String subject,
            @RequestParam String message) {
        log.info("Name: {}", name);
        log.info("MobileNum: {}", mobileNum);
        log.info("Email: {}", email);
        log.info("Subject: {}", subject);
        log.info("Message: {}", message);

        return new ModelAndView("redirect:/contact");
    }

}