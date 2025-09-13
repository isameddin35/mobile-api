package com.isaqurbaon.MobileApi.controller;

import com.isaqurbaon.MobileApi.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
    Student student1 = new Student(1L, "Isa", 20);

    @GetMapping("greet")
    public Student greet() {
        return student1;
    }
}
