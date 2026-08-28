package com.tca.repository;

import com.tca.entity.Student;
import com.tca.enums.Gender;
import org.springframework.cglib.core.Local;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
   List<Student> findByGender(Gender gender);
   List<Student> findByBirthDate(LocalDate localDate);
   List<Student> findByName(String name);
   List<Student>findByPer(Double per);
   List<Student> findByBirthDateGreaterThan(LocalDate localDate);
   List<Student> findByPerBetween(Double afterPer , Double beforePer);
   List<Student> findByNameStartingWith(String prifix);
}
