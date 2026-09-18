package com.tca.controller;

import com.tca.entity.Student;
import com.tca.enums.Gender;
import com.tca.service.StudentService;
import jdk.jfr.Category;
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
          student.setPer(76D);
          student.setGender(Gender.MALE);
          student.setBirthDate(LocalDate.of(2000,12,1));

          student = studentService.saveStudent(student);
//
//        Student student1 = new Student();
//        student1.setName("Rahul");
//        student1.setPer(82D);
//        student1.setGender(Gender.MALE);
//        student1.setBirthDate(LocalDate.of(2001, 5, 15));
//
//        student1 = studentService.saveStudent(student1);
//
//        Student student2 = new Student();
//        student2.setName("Sneha");
//        student2.setPer(91D);
//        student2.setGender(Gender.FEMALE);
//        student2.setBirthDate(LocalDate.of(2002, 8, 22));
//
//        student2 = studentService.saveStudent(student2);
//
//        Student student3 = new Student();
//        student3.setName("Amit");
//        student3.setPer(68D);
//        student3.setGender(Gender.MALE);
//        student3.setBirthDate(LocalDate.of(1999, 11, 10));
//
//        student3 = studentService.saveStudent(student3);


        System.out.println(student);
    }
}
