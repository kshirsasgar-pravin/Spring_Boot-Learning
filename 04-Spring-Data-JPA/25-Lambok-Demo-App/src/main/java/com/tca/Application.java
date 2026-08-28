package com.tca;

import com.tca.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Student student = new Student(101,"Pravin",78.34);
        System.out.println(student);
        student.setRno(102);
        student.setName("Yash");
        student.setPer(89.5);
        System.out.println(student);
        System.out.println(student.getRno());
        System.out.println(student.getName());
        System.out.println(student.getPer());

        Student student2 = new Student(101,"Pravin",78.34);
        Student student1 = new Student(101,"Pravin",78.34);
        System.out.println("studnet is equal to student1 " +student2.equals(student1));

    }

}
