package com.tca.entity;


import com.tca.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    @Id
    @GenericGenerator(name = "my-custom-generator", strategy = "com.tca.idGenerator.IdGenerator")
    @GeneratedValue(generator = "my-custom-generator")
    private String studentId;

    private String name;

    private Double per;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate birthDate;
}
