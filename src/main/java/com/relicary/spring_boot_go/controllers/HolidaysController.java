package com.relicary.spring_boot_go.controllers;

import com.relicary.spring_boot_go.model.Holiday;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Slf4j
public class HolidaysController {

    @GetMapping("/holidays/{display}")
    public String displayHolidays(
            @PathVariable String display,
            Model model
    ) {

        if(StringUtils.hasText(display) && display.equals("all")) {
            model.addAttribute("festival", true);
            model.addAttribute("federal", true);
        }
        else if (StringUtils.hasText(display) && display.equals("federal")) {
            model.addAttribute("federal", true);
        }
        else if (StringUtils.hasText(display) && display.equals("festival")) {
            model.addAttribute("festival", true);
        }

        List<Holiday> holidays = Arrays.asList(
                new Holiday(" Jan 1 ","New Year's Day", Holiday.Type.FESTIVAL),
                new Holiday(" Oct 31 ","Halloween", Holiday.Type.FESTIVAL),
                new Holiday(" Nov 24 ","Thanksgiving Day", Holiday.Type.FESTIVAL),
                new Holiday(" Dec 25 ","Christmas", Holiday.Type.FESTIVAL),
                new Holiday(" Jan 17 ","Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
                new Holiday(" July 4 ","Independence Day", Holiday.Type.FEDERAL),
                new Holiday(" Sep 5 ","Labor Day", Holiday.Type.FEDERAL),
                new Holiday(" Nov 11 ","Veterans Day", Holiday.Type.FEDERAL)
        );

        Holiday.Type[] types = Holiday.Type.values();

        for (Holiday.Type type : types) {
            model.addAttribute(
                    type.toString(),
                    holidays.stream()
                        .filter(
                            holiday ->
                            holiday.getType().equals(type)
                        )
                        .collect(Collectors.toList())
            );
        }
        return "holidays.html";
    }

}