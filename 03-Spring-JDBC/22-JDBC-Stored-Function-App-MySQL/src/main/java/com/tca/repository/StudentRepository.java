package com.tca.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.io.IOError;
import java.io.IOException;
import java.util.Map;

@Repository
public class StudentRepository {

    @Autowired
    SimpleJdbcCall simpleJdbcCall;
    public String getGrade(int rno)  throws IOException {
        String grade = null;
        Map<String,Object> map = simpleJdbcCall.execute(rno);
        return map.get("return").toString();
    }
}
