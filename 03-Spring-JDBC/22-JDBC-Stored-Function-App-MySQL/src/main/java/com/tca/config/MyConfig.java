package com.tca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;

@Configuration
public class MyConfig {

    @Bean
    public SimpleJdbcCall getJdbcCall(DataSource dataSource){
        return new SimpleJdbcCall(dataSource).withFunctionName("get_grade");
    }
}
