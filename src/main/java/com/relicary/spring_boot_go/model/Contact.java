package com.relicary.spring_boot_go.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Contact {

    String name;
    String mobileNum;
    String email;
    String subject;
    String message;
}
