package com.tca.controller;

import com.tca.entity.Employee;
import com.tca.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/show")
    public String getAllEmployee(Model model){

        List<Employee> employees =employeeService.getAllEmployees();

        model.addAttribute("employees",employees);

        return "view";
    }
}

