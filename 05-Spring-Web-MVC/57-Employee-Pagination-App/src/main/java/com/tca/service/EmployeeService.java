package com.tca.service;

import com.tca.entity.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
     public Page<Employee> getAllEmployees(int pageNumber, int pageSize);
}
