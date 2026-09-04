package com.tca.entity;

import com.tca.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    @SequenceGenerator(name = "rno_gen",
                       sequenceName = "student_seq",
                       allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "rno_gen")
    private Integer studentId;

    private String name;

    private Double per;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate birthDate;
}
