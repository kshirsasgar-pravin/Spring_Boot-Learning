package com.tca.entity;

import com.tca.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table
@NamedNativeQuery(name="Teacher.wantByGender",
        query="SELECT * FROM TEACHER t WHERE t.gender =:gender",
        resultClass = Teacher.class)
@NamedNativeQuery(name="Teacher.wantGenderAndAge",
        query="SELECT t.gender,t.age FROM TEACHER t")
@NamedNativeQuery(name="Teacher.updateTeacherAge",
                  query="UPDATE TEACHER  SET age = :age WHERE teacher_id = :teacherId")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    @Id
    private Long teacherId;

    private String name;

    private Integer age;

    private String subject;

    private LocalDate joinDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;


    private void setName(String name){
        this.name = name;
        System.out.println("=".repeat(23));
        System.out.println("This is setter method cheking ");
        System.out.println("=".repeat(23));
    }
}
