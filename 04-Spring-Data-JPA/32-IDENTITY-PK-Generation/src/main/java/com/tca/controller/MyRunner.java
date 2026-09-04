package com.tca.controller;


import com.tca.entity.Student;
import com.tca.enums.Gender;
import com.tca.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    StudentService studentService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Student student = new Student();
        student.setName("Pravin");
        student.setPer(80d);
        student.setGender(Gender.MALE);
        student.setBirthDate(LocalDate.of(2004,8,21));

        student = studentService.addStudent(student);

        System.out.println(student);
    }
}
