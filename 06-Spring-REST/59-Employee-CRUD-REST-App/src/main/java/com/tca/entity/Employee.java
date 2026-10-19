package com.tca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {

    @Id
    private Long employeeId;

    private String name;

    private Double salary;

    private Integer Age;

    private LocalDate dateOfJoin;

    private LocalDate updatedAt;

    private Integer deptNo;


}
