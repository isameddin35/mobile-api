package com.isaqurbaon.MobileApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {

    @GetMapping("greet")
    public String greet() {
        return "Hello Mobile World";
    }
}
