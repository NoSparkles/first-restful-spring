package com.first.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.first.spring.model.Student;

@Repository
public class InMemoryStudentDAO {
    private final List<Student> students = new ArrayList<>();

    public List<Student> findAllStudents() {
        return students;
    }

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student findByEmail(String email) {
        return students.stream()
            .filter((element) -> element.getEmail().equals(email))
            .findFirst()
            .orElse(null);
    }

    public Student updateStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getEmail().equals(student.getEmail())) {
                students.set(i, student);
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(String email) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getEmail().equals(email)) {
                students.remove(i);
            }
        }
    }
}
