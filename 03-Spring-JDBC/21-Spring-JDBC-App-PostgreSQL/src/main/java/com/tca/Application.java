package com.tca;

import com.tca.module.Student;
import com.tca.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        Student student = new Student(101,"Sanket",80.62,"Mumbai");
        StudentRepository studentRepository = applicationContext.getBean(StudentRepository.class);
        if(studentRepository.saveStudent(student)){
            System.out.println("Student added successfully");
        }
        else{
            System.out.println("Failed to insert data");
        }
        student.setName("Prakash");
        if (studentRepository.updateStudent(student)){
            System.out.println("Data updated successfully");
        }
        else{
            System.out.println("Failed to update student");
        }




        if(studentRepository.findBy(101) != null){
            System.out.println(studentRepository.findBy(101));
        }
        else{
            System.out.println("Data not found for rno "+101);
        }

        if(studentRepository.findAll() != null){
            System.out.println(studentRepository.findAll());
        }
        else{
            System.out.println("No student found");
        }

        if(studentRepository.fineCityWise("Pune") != null){
            System.out.println(studentRepository.fineCityWise("Pune"));
        }
        else System.out.println("No data found for city pune ");


        if(studentRepository.deleteStudentById(101)){
            System.out.println("Student delted successfully for rno "+101);
        }
        else{
            System.out.println("Failed to delete the student for rno "+101);
        }
    }


}
