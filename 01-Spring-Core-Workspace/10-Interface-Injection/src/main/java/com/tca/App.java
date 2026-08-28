package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.entities.ServiceA;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      
      context.getBean(ServiceA.class).printMessage();
      
      ((ClassPathXmlApplicationContext)context).close();
    }
}
