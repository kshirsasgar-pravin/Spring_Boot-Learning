package com.tca.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.tca.model.Student;

@Configuration
@ComponentScan("com.tca.service")
@ComponentScan("com.tca.repository")
public class AppConfig {
     @Bean
     @Primary
     Map<String,Student> getStudentStore(){
    	 Map<String,Student> hmob = new HashMap<>();
    	 
    	 Student s1= new Student("Sachin","new Sangavi",80.5);
         Student s2 = new Student("Sourabh","old sangavi",99.5);
    	 
    	 hmob.put("sb-1", s1);
    	 hmob.put("sb-2", s2);
    	 
    	 return hmob;
     }
     
     @Bean
     @Primary
     Map<String,Student> getStudentStore2(){
    	 Map<String,Student> hmob = new HashMap<>();
    	 
    	 Student s1= new Student("Pravin","anala",80.5);
         Student s2 = new Student("Ram","Paranda",99.5);
    	 
    	 hmob.put("sb-1", s1);
    	 hmob.put("sb-2", s2);
    	 
    	 return hmob;
     }
}
