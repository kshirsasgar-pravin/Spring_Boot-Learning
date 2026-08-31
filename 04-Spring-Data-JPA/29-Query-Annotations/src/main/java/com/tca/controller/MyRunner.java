package com.tca.controller;

import com.tca.entity.Student;
import com.tca.enums.Gender;
import com.tca.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {



        public static void printStudents(List<Student> list){
            if(list.isEmpty()) System.out.println("No single record found.");
            for (Student student : list){
                System.out.println("Roll Number : "+ student.getStudentId());
                System.out.println("Name        : "+ student.getName());
                System.out.println("Percentage  : "+ student.getPer());
                System.out.println("Gender      : "+student.getGender());
                System.out.println("DATE        : "+student.getBirthDate());
                System.out.println("=".repeat(30));
            }



    }



    @Autowired
    StudentService studentService;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<Object[]> list = studentService.findNameGenderPer(Gender.FEMALE,80d);

        for(Object[] ob : list){
            System.out.println("Name   : "+ob[0]);
            System.out.println("Per    : "+ob[1]);
            System.out.println("Gender :"+ob[2]);
            System.out.println("=".repeat(20));
        }
    }
}
