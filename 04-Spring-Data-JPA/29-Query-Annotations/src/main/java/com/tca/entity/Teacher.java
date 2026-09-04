package com.tca.entity;

import com.tca.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table
@NamedQuery(name="Teacher.wantByGender",query="SELECT t FROM Teacher t WHERE gender =:gender")
@NamedQuery(name="Teacher.wantGenderAndAge",query="SELECT t.gender,t.age FROM Teacher t")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    @Id
    private Long TeacherId;

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
