package com.tca;

import com.tca.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;
import java.util.Map;

class A implements Cloneable {
   int rno;
   String name;
    int[] arr = new int[2];
    A(){
        arr[0]= 10;
        arr[1]=20;
    }
    protected A clone() throws CloneNotSupportedException {
        A t = (A) super.clone();
        return t;
    }
}

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        StudentRepository studentRepository = applicationContext.getBean(StudentRepository.class);
        String result = null;
        try {
            result = studentRepository.getGrade(101);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(result);

        A a = new A();
        System.out.println(a.arr);
        A a1 = a.clone();
        System.out.println(a1.arr);
        System.out.println(a.arr == a1.arr );
    }

}
