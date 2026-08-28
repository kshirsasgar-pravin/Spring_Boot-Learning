package com.tca.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.model.Student;
import com.tca.repository.StudentRepository;

@Service
public class StudentService {
	    
	    @Autowired
        private StudentRepository studentRepository;
	    
	    public Student getStudentById(String key) {
	    	
	    	if(studentRepository.findById(key) == null) return null;
	    	
	    	return studentRepository.findById(key); 
	    	
	    	
	    }
	    
	    public Map<String,Student> getAllStudents(){
	    	return studentRepository.findAll();
	    }
}
