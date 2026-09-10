package com.tca.entities;

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
    @TableGenerator(name = "Id_generator",
                    pkColumnName = "gen_name",
                    valueColumnName = "gen_value",
                    pkColumnValue = "student_id",
                    allocationSize = 50
    )
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "Id_generator")
    private Long studentId;

    private String name;

    private Double per;

    @Enumerated(EnumType.STRING)
    private Gender gende;

    private LocalDate birthDate;
}
