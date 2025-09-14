package com.isaqurbanov.MobileApi.controller;

import com.isaqurbanov.MobileApi.entity.Student;
import com.isaqurbanov.MobileApi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
@RequiredArgsConstructor
public class MobileController {
    private final StudentService studentService;

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("save")
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }


}