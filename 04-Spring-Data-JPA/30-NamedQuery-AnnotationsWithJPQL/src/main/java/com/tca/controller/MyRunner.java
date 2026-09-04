package com.tca.controller;

import com.tca.entity.Teacher;
import com.tca.enums.Gender;
import com.tca.service.TeacherService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    private DataSource dataSource;

       public static void printTeachers(List<Teacher> teachers){
           if(!teachers.isEmpty()){
               for(Teacher teacher : teachers){

                   System.out.println("Name      : "+teacher.getName());
                   System.out.println("Subject   : "+teacher.getSubject());
                   System.out.println("Age       : "+teacher.getAge());
                   System.out.println("Gender    : "+teacher.getGender());
                   System.out.println("Join date : "+teacher.getJoinDate());
                   System.out.println("=".repeat(30));

               }
           }
       }


    @Autowired
    TeacherService teacherService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
/*
        // Saveing a Teacher Data
//        Teacher teacher1 = new Teacher(1L,"Shinde",58,"Marathi", LocalDate.of(2026,1,1),Gender.MALE);
        Teacher teacher2 = new Teacher(2L,"Kendre",56,"Physics",LocalDate.of(2026,5,1),Gender.FEMALE);
        Teacher teacher3 = new Teacher(3L,"Raut",42,"Chemistry",LocalDate.of(2026,6,1),Gender.MALE);

        List<Teacher> teachers = new ArrayList<>();

        teachers.add(teacher2);
        teachers.add(teacher3);

       teachers =  teacherService.saveAll(teachers);



        if(!teachers.isEmpty()) {

            System.out.println("=".repeat(20));

            System.out.println("All Teachers Saved successfully");
            System.out.println("The saved Entity is " + teachers);

            System.out.println("=".repeat(20));
        }

 */
        // Fetching a Data using NamedQuery

        List<Teacher> teachers = teacherService.getAll();
        System.out.println("=".repeat(30));
        printTeachers(teachers);

        List<Teacher> teacherByGender = teacherService.getByGender(Gender.MALE);
        System.out.println("TEACHERS BY GENDER MALE");
        printTeachers(teacherByGender);

       if(teacherService.updateTeacherAge(39,1L) > 0){
           System.out.println("Age updated sucessfully");
       }



        System.out.println("=:".repeat(10)+"TEACHERS GENDER AND AGE"+"=:".repeat(10));
        List<Object[]> teacherByGenderAndAge = teacherService.wantGenderAndAge();
        for (Object[] ob : teacherByGenderAndAge){

            System.out.println("Gender is : " +ob[0]);
            System.out.println("Age is : "+ob[1]);
            System.out.println("=:".repeat(20));
        }



    }

}
