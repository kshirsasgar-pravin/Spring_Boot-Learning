package com.tca.service;

import com.tca.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long employeeId);

    List<Employee> getAllEmployee();

    Employee updateEmployee(Employee employee);

    Employee patchEmployee(Employee employee);

    Boolean deleteEmployeeById(Long employeeId);


}
