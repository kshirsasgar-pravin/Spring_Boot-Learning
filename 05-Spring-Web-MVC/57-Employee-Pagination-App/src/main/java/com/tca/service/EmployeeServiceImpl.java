package com.tca.service;

import com.tca.entity.Employee;
import com.tca.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{


    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public Page<Employee> getAllEmployees(int pageNumber, int pageSize) {

        Pageable pageable = PageRequest.of(pageNumber,pageSize);

        return employeeRepository.findAll(pageable);
    }
}
