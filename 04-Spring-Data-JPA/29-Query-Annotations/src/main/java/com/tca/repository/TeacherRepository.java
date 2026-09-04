package com.tca.repository;

import com.tca.entity.Teacher;
import com.tca.enums.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeacherRepository extends CrudRepository<Teacher,Long> {
//    List<Teacher> findByName();
    List<Teacher> wantByGender(@Param("gender") Gender gender);
    List<Object[]> wantGenderAndAge();
}
