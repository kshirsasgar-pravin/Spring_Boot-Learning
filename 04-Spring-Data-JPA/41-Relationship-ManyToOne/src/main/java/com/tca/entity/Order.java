package com.tca.entity;

import com.tca.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {

    @Id
    private Long OrderId;

    private LocalDate orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;


}
