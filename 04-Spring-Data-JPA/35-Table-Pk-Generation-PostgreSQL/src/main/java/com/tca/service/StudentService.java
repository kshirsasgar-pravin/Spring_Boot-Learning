package com.tca.service;

import com.tca.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudent();

}
