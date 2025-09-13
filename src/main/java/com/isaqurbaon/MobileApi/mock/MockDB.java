package com.isaqurbaon.MobileApi.mock;

import com.isaqurbaon.MobileApi.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MockDB {
    List<Student> studentList = Arrays.asList(
            new Student(1L, "Isa", 20),
            new Student(2L, "Ayxan", 18),
            new Student(3L, "Arzu", 15)
    );

    public Student findById(Long givenId) {
        Student fountStudent = null;
        for (Student student : studentList) {
            if (givenId.equals(student.getId())) {
                fountStudent = student;
            }
        }
        return fountStudent;
    }
}
