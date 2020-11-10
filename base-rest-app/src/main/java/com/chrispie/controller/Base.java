package com.chrispie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hallo")
public class Base {

    @GetMapping("/")
    public String retrieveCustomer() {
        throw new RuntimeException("Hallo there");
    }
}
