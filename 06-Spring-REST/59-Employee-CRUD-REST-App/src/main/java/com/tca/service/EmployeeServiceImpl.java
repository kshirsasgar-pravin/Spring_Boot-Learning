package com.tca.service;

import com.tca.entity.Employee;
import com.tca.mapper.EmployeeMapper;
import com.tca.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public Employee saveEmployee(Employee employee) {

        if(employeeRepository.existsById(employee.getEmployeeId())){
            System.out.println("Employee already Exist in DB");
            return null;
        }

        employee.setDateOfJoin(LocalDate.now());

        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {

//        Optional<Employee> employee = employeeRepository.findById(employeeId);
//
//        if(employee.isPresent()) return employee.get();
//        return null;
//           ^
//           |
        // Above code is similar to the below return statement
        return employeeRepository.findById(employeeId).orElse(null);


    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {

        Employee existingEmployee = employeeRepository.findById(employee.getEmployeeId()).orElse(null);

        if(existingEmployee == null) {
            System.out.println("Employee does not exits");
            return null;
        }

        employee.setDateOfJoin(existingEmployee.getDateOfJoin());
        employee.setUpdatedAt(LocalDate.now());

        return employeeRepository.save(employee);
    }

    @Override
    public Employee patchEmployee(Employee requestEmployee) {
        Employee existingEmployee = employeeRepository
                .findById(requestEmployee.getEmployeeId())
                .orElse(null);

                if(existingEmployee == null){
            System.out.println("Employee does not exist");
            return null;
        }

        //   Updating the Field with the help of 'if' statement

//        if(employee.getName() != null){
//            existingEmployee.setName(requestEmployee.getName());
//            existingEmployee.setUpdatedAt(LocalDate.now());
//        }
//        if(employee.getDeptNo() != null){
//            existingEmployee.setDeptNo(requestEmployee.getDeptNo());
//            existingEmployee.setUpdatedAt(LocalDate.now());
//        }
//
//        if(employee.getSalary() != null){
//            existingEmployee.setSalary(requestEmployee.getSalary());
//            existingEmployee.setUpdatedAt(LocalDate.now());
//        }
//
//        if(employee.getDateOfJoin() != null){
//            existingEmployee.setDateOfJoin(requestEmployee.getDateOfJoin());
//            existingEmployee.setUpdatedAt(LocalDate.now());
//        }

        // Updating Entity with help of MapStruct library

        employeeMapper.updateEmployee(requestEmployee,existingEmployee);
        existingEmployee.setUpdatedAt(LocalDate.now());
        return employeeRepository.save(existingEmployee);
    }

    @Override
    public Boolean deleteEmployeeById(Long employeeId) {
        if(!employeeRepository.existsById(employeeId)){
            return false;
        }

        employeeRepository.deleteById(employeeId);
        return true;
    }
}
