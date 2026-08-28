package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student st = context.getBean(Student.class);
        String str = st.getMessage();
        System.out.println(str);
        int id = st.getId();
        System.out.println(id);
    }
}
