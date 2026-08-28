package com.tca.service;

import com.tca.entity.Student;
import com.tca.enums.Gender;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    public Optional<Student> fetchById(Integer rno);
    public List<Student> fetchAllStudents();

    public List<Student> fetchByGender(Gender gender);
    public List<Student> fetchByBirthDate(LocalDate localDate);

    public List<Student> fetchByName(String name);
    public List<Student> fetchByPer(Double per);

    public List<Student> fetchByBirthDateGreaterThan(LocalDate localDate);
    public List<Student> fetchByPerBetween(Double afterPer , Double beforePer);
    List<Student> fetchByNameStartingWith(String prefix);
}
