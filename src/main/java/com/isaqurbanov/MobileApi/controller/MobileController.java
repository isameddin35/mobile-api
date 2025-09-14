package com.isaqurbanov.MobileApi.controller;

import com.isaqurbanov.MobileApi.entity.Student;
import com.isaqurbanov.MobileApi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class MobileController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable Long id) {

        return studentService.getStudentById(id);
    }

    @PostMapping
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }



}