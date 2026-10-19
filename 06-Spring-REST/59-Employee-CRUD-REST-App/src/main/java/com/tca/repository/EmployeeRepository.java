package com.tca.repository;

import com.tca.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    void deleteById(Long employeeId);
}
