package com.tca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {


    @Id
    private Long empId;

    private String name;

    private Integer deptNo;

    private Double salary;


}
