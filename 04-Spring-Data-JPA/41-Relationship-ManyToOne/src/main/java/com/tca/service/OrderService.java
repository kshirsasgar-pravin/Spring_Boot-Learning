package com.tca.service;

import com.tca.entity.Order;
import com.tca.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderService {
     Order saveOrder(Order order);
     List<Order> saveAll(List<Order> orders);
     Order fetchOrderById(Long id);
//     Order updateOrder(Order order);
}
