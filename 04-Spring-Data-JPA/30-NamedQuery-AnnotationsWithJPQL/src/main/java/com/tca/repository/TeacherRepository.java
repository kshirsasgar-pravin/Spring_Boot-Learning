package com.tca.repository;

import com.tca.entity.Teacher;
import com.tca.enums.Gender;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeacherRepository extends CrudRepository<Teacher,Long> {
//    List<Teacher> findByName();
    List<Teacher> wantByGender(@Param("gender") Gender gender);
    List<Object[]> wantGenderAndAge();

    @Modifying
    @Transactional
    Integer updateTeacherAge(@Param("age")Integer age , @Param("teacherId") Long teacherId);
}
