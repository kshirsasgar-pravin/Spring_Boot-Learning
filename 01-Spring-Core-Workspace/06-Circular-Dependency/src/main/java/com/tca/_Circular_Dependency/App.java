package com.tca._Circular_Dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.ServiceA;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        ServiceA aob = context.getBean(ServiceA.class);
        
        aob.display();
    }
}
