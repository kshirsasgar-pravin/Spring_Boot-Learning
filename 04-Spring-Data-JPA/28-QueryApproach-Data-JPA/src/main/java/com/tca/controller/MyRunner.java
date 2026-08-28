package com.tca.controller;

import com.tca.entity.Student;
import com.tca.enums.Gender;
import com.tca.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    StudentService studentService;

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

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("=".repeat(15)+"FIND BY GENDER METHOD IMPLEMENTATION"+ "=".repeat(15));
        List<Student> studentList = studentService.fetchByGender(Gender.MALE);
        if(studentList.isEmpty()) System.out.println("No Student found");
        else MyRunner.printStudents(studentList);

        System.out.println("===================FIND BY BIRTH DATE METHOD IMPLEMENTATION======================");
        List<Student> birthDateList = studentService.fetchByBirthDate(LocalDate.of(2002,5,15));
        if(birthDateList.isEmpty()) System.out.println("No record found");
        else MyRunner.printStudents(birthDateList);

        System.out.println("=".repeat(15)+"FIND BY NAME METHOD IMPLEMENTATION"+ "=".repeat(15));
        List<Student> sameNameList = studentService.fetchByName("Priya");
        if(sameNameList.isEmpty()) System.out.println("NO record found");
        else MyRunner.printStudents(sameNameList);

        System.out.println("=".repeat(15)+"FIND BY PERCENTAGE METHOD IMPLEMENTATION"+ "=".repeat(15));
        List<Student> percentageList = studentService.fetchByPer(78.5);
        if(percentageList.isEmpty()) System.out.println("NO recored found ");
        else MyRunner.printStudents(percentageList);

        System.out.println("=".repeat(15)+"FIND BY GREATER THAN BIRTH DATE  METHOD IMPLEMENTATION"+ "=".repeat(15));
        List<Student> greaterThanDate = studentService.fetchByBirthDateGreaterThan(LocalDate.of(2002,5,15));
        if(greaterThanDate.isEmpty()){
            System.out.println("No recored found ");
        }
        else MyRunner.printStudents(greaterThanDate);

        System.out.println("=".repeat(15)+"FIND BY PERCENTAGE BETWEEN METHOD IMPLEMENTATION"+ "=".repeat(15));
        List<Student> percentageBetween = studentService.fetchByPerBetween(80d,90d);
        if(percentageBetween.isEmpty()) System.out.println("No Data found");
        else MyRunner.printStudents(percentageBetween);

        System.out.println("=".repeat(15)+"FIND BY NAME START WITH METHOD IMPLEMENTATION"+ "=".repeat(15));
        List<Student> nameStartingWith = studentService.fetchByNameStartingWith("A ");
        if(nameStartingWith.isEmpty()) System.out.println("No record found");
        else MyRunner.printStudents(nameStartingWith);
    }
}