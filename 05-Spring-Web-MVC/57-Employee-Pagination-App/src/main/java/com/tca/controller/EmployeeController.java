package com.tca.controller;

import com.tca.entity.Employee;
import com.tca.service.EmployeeService;
import jakarta.servlet.ServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/view")
    public String getAllEmployees(@RequestParam(defaultValue = "0") int pageNumber, Model model)
    {
        int pageSize = 3;
        Page<Employee> employeePage = employeeService.getAllEmployees(pageNumber,pageSize);
        model.addAttribute("employees",employeePage.getContent());
        model.addAttribute("currentPage",employeePage.getNumber());
        model.addAttribute("hasNext",employeePage.hasNext());
        model.addAttribute("hasPrevious",employeePage.hasPrevious());

        return "view";
    }
}
