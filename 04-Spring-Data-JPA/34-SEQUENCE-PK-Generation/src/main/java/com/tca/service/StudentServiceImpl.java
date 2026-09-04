package com.tca.service;

import com.tca.entity.Student;
import com.tca.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentServiece")
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Student addStudent(Student student) {
        return (Student) studentRepository.save(student);
    }
}
