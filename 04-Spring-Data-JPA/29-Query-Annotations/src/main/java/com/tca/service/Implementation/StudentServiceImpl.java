package com.tca.service.Implementation;

import com.tca.entity.Student;
import com.tca.enums.Gender;
import com.tca.repository.StudentRepository;
import com.tca.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

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

    @Override
    public long deleteByPerAndGender(Double per, Gender gender) {
        return studentRepository.deleteByPerAndGender(per,gender);
    }

    @Override
    public long updateNamebyId(String name, Integer studentId) {
        return studentRepository.updateByStudentId(name,studentId);
    }
}
