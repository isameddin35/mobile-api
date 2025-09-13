package com.isaqurbaon.MobileApi.controller;

import com.isaqurbaon.MobileApi.entity.Student;
import com.isaqurbaon.MobileApi.mock.MockDB;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MobileController {
    private final MockDB db;


    @GetMapping("student/{id}")
    public Student greet(@PathVariable Long id) {
        return db.findById(id);
    }
}
