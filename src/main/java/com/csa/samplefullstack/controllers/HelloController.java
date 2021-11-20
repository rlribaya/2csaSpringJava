package com.csa.samplefullstack.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*") //allow all request
public class HelloController {
    @RequestMapping("hello")
    public String hello() {
        return "hello spring!";
    }
}
