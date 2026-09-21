package com.tca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String name;

    private Integer phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    private List<Order> orders;

}
