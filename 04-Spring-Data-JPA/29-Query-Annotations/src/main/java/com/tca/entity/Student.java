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
      private Integer studentId;

      @Column(name="NAME")
      private String name;

      @Column(name="PER")
      private Double per;

      @Enumerated(EnumType.STRING)
      @Column(name = "GENDER")
      private Gender gender;

      private LocalDate birthDate;

}
