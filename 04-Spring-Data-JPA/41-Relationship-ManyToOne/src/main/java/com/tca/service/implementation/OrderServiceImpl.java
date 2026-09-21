package com.tca.service.implementation;

import com.tca.entity.Order;
import com.tca.repository.OrderRepository;
import com.tca.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> saveAll(List<Order> orders) {
        return orderRepository.saveAll(orders);
    }

    @Override
    public Order fetchOrderById(Long id) {
        return orderRepository.findById(id).get();
    }

//    @Override
//    public Order updateOrder(Order order) {
//        return orderRepository.save(order);
//    }
}
