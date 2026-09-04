package com.tca.entity;

import com.tca.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    private String name;

    private Double per;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate birthDate;
}
