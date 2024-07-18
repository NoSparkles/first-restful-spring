package com.first.spring.service;

import java.util.List;

import com.first.spring.model.Student;


public interface StudentService {
    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
