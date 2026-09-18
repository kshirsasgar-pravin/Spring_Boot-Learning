package com.tca.service;

import com.tca.entity.Customer;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);
    public Customer findById(Long customerId);
    void deleteCustomerById(Long customerId);
}
