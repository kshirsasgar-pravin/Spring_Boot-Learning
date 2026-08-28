package com.tca.repository;

import com.tca.module.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.List;
import java.util.Map;

@Component
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public boolean saveStudent(Student student){
        String sql = "INSERT INTO student values(?,?,?,?)";
        int status = jdbcTemplate.update(sql,student.getRno(),student.getName(),student.getPer(),student.getCity());
        return status > 0;
    }
    public boolean updateStudent(Student student){
        String sql = "UPDATE Student SET name = ?,per=?, city=? WHERE rno =?";
        return jdbcTemplate.update(sql,student.getName(),student.getPer(),student.getCity(),student.getRno()) > 0 ;
    }

    public Map<String,Object> findBy(int rno){
        String sql = "SELECT * FROM student WHERE rno = ?";
        Map<String, Object> obj = jdbcTemplate.queryForMap(sql,rno);
        return obj;
    }

    public List<Map<String, Object>> findAll(){
        String sql = "SELECT * FROM STUDENT";
        return jdbcTemplate.queryForList(sql);
    }

   public List<Map<String,Object>> fineCityWise(String city){
        String sql = "SELECT * FROM student WHERE city = ?";
        return jdbcTemplate.queryForList(sql,city);
   }


    public boolean deleteStudentById(int id){
        String sql = "DELETE FROM student WHERE rno = ?";
        int status = jdbcTemplate.update(sql,id);
        return status > 0;
    }


}
