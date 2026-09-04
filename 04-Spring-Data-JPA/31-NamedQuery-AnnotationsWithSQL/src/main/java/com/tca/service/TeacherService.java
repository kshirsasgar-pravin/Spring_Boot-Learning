package com.tca.service;

import com.tca.entity.Teacher;
import com.tca.enums.Gender;

import java.util.List;
import java.util.Optional;

public interface TeacherService {
    Teacher addTeacher(Teacher teacher);
    List<Teacher> saveAll(List<Teacher> list);
    List<Teacher> getAll();
    Optional<Teacher> getById(Long TeacherId);
//    List<Teacher> getByName(String name);
      List<Teacher> getByGender(String gender);
      List<Object[]> wantGenderAndAge();
      Integer updateTeacherAge(Integer age , Long teacherId);
}
