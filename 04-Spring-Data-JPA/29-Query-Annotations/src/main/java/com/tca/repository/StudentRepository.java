package com.tca.repository;

import com.tca.entity.Student;
import com.tca.enums.Gender;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT s FROM Student s")
    List<Student> wantAll();

//    @Query(value = "SELECT * FROM student s WHERE s.PER BETWEEN ?1 AND ?2",nativeQuery = true)
    @Query(value = "SELECT * FROM student s WHERE s.PER BETWEEN :low AND :last ",nativeQuery = true)
    List<Student> findPercentageRange(@Param("low") Double afterPer , @Param("last") Double beforePer);


    @Query("""
            SELECT s.name, s.per, s.gender
            FROM Student s 
            WHERE s.gender = :gender AND s.per >= :per
          """)
    List<Object[]> findGenderNamePer(
            @Param("gender") Gender gender,
            @Param("per") Double per
    );

    @Modifying
    @Transactional
    @Query("DELETE FROM Student s WHERE s.per > :per AND s.gender = :gender")
    public long deleteByPerAndGender(
            @Param("per") Double per,
            @Param(("gender")) Gender gender
    );

    @Modifying
    @Transactional
    @Query("UPDATE Student s SET s.name =:name WHERE  s.studentId =:studentId")
    public long updateByStudentId(
            @Param("name")String name,
            @Param("studentId")Integer studentId
    );


}
