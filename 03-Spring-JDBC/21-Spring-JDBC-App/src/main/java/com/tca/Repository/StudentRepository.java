package com.tca.Repository;

import com.tca.module.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public boolean saveStident(Student student){

        String sql = "INSERT INTO student VALUES(?,?,?,?)";
        int status = jdbcTemplate.update(sql,student.getRno(),student.getName(),student.getPer(),student.getCity());
        return status > 0;
    }

}
