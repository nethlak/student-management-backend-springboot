package com.example.springbootbackend.service;

import com.example.springbootbackend.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
