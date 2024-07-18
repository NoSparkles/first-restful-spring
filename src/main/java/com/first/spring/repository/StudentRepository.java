package com.first.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first.spring.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
