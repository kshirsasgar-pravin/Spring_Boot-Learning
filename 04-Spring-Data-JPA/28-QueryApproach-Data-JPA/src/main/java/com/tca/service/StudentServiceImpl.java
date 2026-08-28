package com.tca.service;

import com.tca.entity.Student;
import com.tca.enums.Gender;
import com.tca.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service("studentService")
public class StudentServiceImpl implements  StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Optional<Student> fetchById(Integer rno) {
        return studentRepository.findById(rno);
    }

    @Override
    public List<Student> fetchAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public List<Student> fetchByGender(Gender gender) {
        return studentRepository.findByGender(gender);
    }

    @Override
    public List<Student> fetchByBirthDate(LocalDate localDate) {
        return studentRepository.findByBirthDate(localDate);
    }

    @Override
    public List<Student> fetchByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public List<Student> fetchByPer(Double per) {
        return studentRepository.findByPer(per);
    }

    @Override
    public List<Student> fetchByBirthDateGreaterThan(LocalDate localDate) {
        return studentRepository.findByBirthDateGreaterThan(localDate);
    }

    @Override
    public List<Student> fetchByPerBetween(Double afterPer, Double beforePer) {
        return studentRepository.findByPerBetween(afterPer, beforePer);
    }

    @Override
    public List<Student> fetchByNameStartingWith(String prefix) {
        return studentRepository.findByNameStartingWith(prefix);
    }
}