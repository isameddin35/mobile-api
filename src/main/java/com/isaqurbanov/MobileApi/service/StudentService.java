package com.isaqurbanov.MobileApi.service;


import com.isaqurbanov.MobileApi.entity.Student;
import com.isaqurbanov.MobileApi.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        Optional<Student> op = studentRepository.findById(id);
        return op.orElseThrow();
    }


    public ResponseEntity<String> saveStudent(Student student) {
        studentRepository.save(student);
        return ResponseEntity.ok("Student saved to Data Base");
    }
}
