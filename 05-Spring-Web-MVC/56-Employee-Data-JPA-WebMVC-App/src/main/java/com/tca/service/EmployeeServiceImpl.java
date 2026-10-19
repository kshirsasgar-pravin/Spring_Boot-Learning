package com.tca.service;

import com.tca.entity.Employee;
import com.tca.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRespository employeeRespository;

    @Override
    public List<Employee> getAllEmployees() {
       return employeeRespository.findAll();
    }
}
