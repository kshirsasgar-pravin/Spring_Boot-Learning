package com.tca.controller;

import com.tca.entity.Employee;
import com.tca.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){

        Employee employee = employeeService.getEmployeeById(id);
        if(employee == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees = employeeService.getAllEmployee();

        if(employees.isEmpty()) return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(employees,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.saveEmployee(employee);
        if(savedEmployee == null) return new ResponseEntity<>(HttpStatus.CONFLICT);
        return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,
                                                   @RequestBody Employee employee){
        Employee updatedEmployee = employeeService.updateEmployee(employee);

        if(updatedEmployee == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(updatedEmployee,HttpStatus.OK);

    }

    @PatchMapping("/{id}")
    public ResponseEntity<Employee> patchEmployee(@PathVariable Long id,
                                                  @RequestBody Employee employee){
        employee.setEmployeeId(id);
        Employee patchedEmployee = employeeService.patchEmployee(employee);
        if(patchedEmployee == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(patchedEmployee,HttpStatus.OK);
     }

     @DeleteMapping("/{id}")
     public ResponseEntity<String> deleteEmployeeById(@PathVariable Long id){

        Boolean status = employeeService.deleteEmployeeById(id);
        if(!status){
            return new ResponseEntity<>("Employee does not exist",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("Employee Deleted Successfully",HttpStatus.OK);
     }
}
