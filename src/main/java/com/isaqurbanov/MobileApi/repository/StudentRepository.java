package com.isaqurbanov.MobileApi.repository;

import com.isaqurbanov.MobileApi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}