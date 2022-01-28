package com.loiane.crudspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    
    private static final String HELLO = "Hello World!";

    @GetMapping
    public String hello() {
        return HELLO;
    }
}
