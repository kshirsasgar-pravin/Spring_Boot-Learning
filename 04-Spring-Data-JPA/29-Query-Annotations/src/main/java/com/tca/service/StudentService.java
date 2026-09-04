package com.tca.service;

import com.tca.entity.Student;
import com.tca.enums.Gender;

import java.util.List;

public interface StudentService {
    List<Student> fetchAllStudents();
    List<Student> findPercentageRange(Double afterPer , Double beforePer);
    List<Object[]> findNameGenderPer(Gender gender , Double per);
    long deleteByPerAndGender(Double per,Gender gender);
    long updateNamebyId(String name,Integer studentId);
}
