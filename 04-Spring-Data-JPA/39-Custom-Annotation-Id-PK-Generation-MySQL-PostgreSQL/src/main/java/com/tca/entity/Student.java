package com.tca.entity;


import com.tca.enums.Gender;
import com.tca.idGenerator.StudentId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    @StudentId(value = "IT")
    private String studentId;

    private String name;

    private Double per;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate birthDate;
}
