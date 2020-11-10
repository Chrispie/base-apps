package com.chrispie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Base {

    @RequestMapping("/")
    public String index() {
        return "Hallo there";
    }
}
