package com.tca.service.Implementation;

import com.tca.entity.Teacher;
import com.tca.enums.Gender;
import com.tca.repository.TeacherRepository;
import com.tca.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

   @Autowired
    TeacherRepository teacherRepository;

    @Override
    public Teacher addTeacher(Teacher teacher) {

        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> saveAll(List<Teacher> list) {
        return (List<Teacher>) teacherRepository.saveAll(list);
    }

    @Override
    public List<Teacher> getAll() {
        return (List<Teacher>) teacherRepository.findAll();
    }

    @Override
    public Optional<Teacher> getById(Long teacherId) {
        return teacherRepository.findById(teacherId);
    }

//    @Override
//    public List<Teacher> getByName(String name) {
//        return teacherRepository.findByName();
//    }
//
    @Override
    public List<Teacher> getByGender(Gender gender) {
        return teacherRepository.wantByGender(gender);
    }

    @Override
    public List<Object[]> wantGenderAndAge() {
        return teacherRepository.wantGenderAndAge();
    }
}
