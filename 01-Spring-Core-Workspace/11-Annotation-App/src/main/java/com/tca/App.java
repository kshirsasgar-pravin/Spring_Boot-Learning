package com.tca;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.config.AppConfig;
import com.tca.model.Student;
import com.tca.service.StudentService;


public class App {
    public static void main(String[] args) {
       
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      
      StudentService service = context.getBean(StudentService.class);
      
      Student s = service.getStudentById("sb-1");
      System.out.println(s);
      
      
      Map<String , Student> hm = service.getAllStudents();
      Set<Entry<String,Student>> entries = hm.entrySet();
      for(Entry<String,Student> entry : entries) {
    	  System.out.println("ID : "+entry.getKey());
    	  System.out.println("VALUE : "+entry.getValue());
      }
      
      
    }
}
