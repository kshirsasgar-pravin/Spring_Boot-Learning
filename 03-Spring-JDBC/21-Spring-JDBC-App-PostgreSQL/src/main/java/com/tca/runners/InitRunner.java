package com.tca.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class InitRunner implements ApplicationRunner {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        jdbcTemplate.execute("DROP TABLE IF EXISTS student");
        System.out.println("DROP TABLE");
        jdbcTemplate.execute("CREATE TABLE student(rno INT primary key,name VARCHAR(30),per FLOAT,city VARCHAR(30))");
        System.out.println("CREATE TABLE");
    }
}
