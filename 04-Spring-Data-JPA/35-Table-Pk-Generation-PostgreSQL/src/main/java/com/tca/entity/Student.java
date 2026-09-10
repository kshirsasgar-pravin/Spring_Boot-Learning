package com.tca.entity;

import com.tca.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    @TableGenerator(name = "id_gen",
                     table = "id_generator",
                     pkColumnName = "gen_name",
                     valueColumnName = "gen_value",
                     pkColumnValue = "student_id",
                     allocationSize = 50)
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "id_gen")
    private Long studentId;

    private String name;

    private Double per;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate birthDate;

}
