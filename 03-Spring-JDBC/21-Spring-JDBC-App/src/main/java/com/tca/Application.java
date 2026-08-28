package com.tca;

import com.tca.Repository.StudentRepository;
import com.tca.module.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext =SpringApplication.run(Application.class, args);
        StudentRepository studentRepository = applicationContext.getBean(StudentRepository.class);
        Student student = new Student(102,"Pravin",98.3,"Pune");
        System.out.println(studentRepository.saveStident(student)); ;
    }
}
