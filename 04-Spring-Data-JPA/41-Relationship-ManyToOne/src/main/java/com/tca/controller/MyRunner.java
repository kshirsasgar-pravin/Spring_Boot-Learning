package com.tca.controller;

import ch.qos.logback.core.joran.spi.NoAutoStartUtil;
import com.tca.entity.Customer;
import com.tca.entity.Order;
import com.tca.enums.OrderStatus;
import com.tca.repository.CustomerRepository;
import com.tca.service.CustomerService;
import com.tca.service.OrderService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    OrderService orderService;

    @Autowired
    CustomerService customerService;


    @Transactional
    @Override
    public void run(ApplicationArguments args) throws Exception {

          Customer customer = new Customer();
          customer.setName("AAA");
          customer.setPhone(1234567890);
        customer.setOrders(Arrays.asList(new Order(1L, LocalDate.now(), OrderStatus.INITIATED,customer),
                                         new Order(2L, LocalDate.now(), OrderStatus.DELIVERED,customer)
                                          )
                            );

        //        Order order = new Order(1L, LocalDate.now(), OrderStatus.INITIATED);
//        Order order1 = new Order(1L, LocalDate.now(), OrderStatus.DELIVERED);
//        List<Order>orders = new ArrayList<>();
//        orders.add(order);
//        orders.add(order1);
//        order = orderService.saveOrder(order);
//        System.out.println(order);
//
       customer = customerService.saveCustomer(customer);
        System.out.println("Customer sved successfully ");


    }
}