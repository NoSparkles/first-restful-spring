package com.first.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.first.spring.model.Student;
import com.first.spring.repository.InMemoryStudentDAO;
import com.first.spring.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
    
}