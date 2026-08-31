package com.tca.service;

import com.tca.entity.Student;
import com.tca.enums.Gender;
import com.tca.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.support.RepositoryMethodInvocationListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> fetchAllStudents() {
        return studentRepository.wantAll();
    }

    @Override
    public List<Student> findPercentageRange(Double afterPer, Double beforePer) {
        return studentRepository.findPercentageRange(afterPer,beforePer);
    }

    @Override
    public List<Object[]> findNameGenderPer(Gender gender, Double per) {
        return studentRepository.findGenderNamePer(Gender.FEMALE,per);
    }
}
