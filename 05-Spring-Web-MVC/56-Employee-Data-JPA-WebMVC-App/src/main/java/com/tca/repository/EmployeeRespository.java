package com.tca.repository;

import com.tca.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee,Long> {
}
