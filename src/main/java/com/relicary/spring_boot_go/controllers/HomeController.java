package com.relicary.spring_boot_go.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"", "/", "/home"})
    public String displayHomePage(Model model) {
    model.addAttribute("username", "Vincent D'Agosta");
        return "home.html";
    }

}