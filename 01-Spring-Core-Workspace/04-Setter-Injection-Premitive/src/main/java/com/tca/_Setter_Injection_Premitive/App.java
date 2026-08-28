package com.tca._Setter_Injection_Premitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.WelcomeBean;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	WelcomeBean wb = context.getBean(WelcomeBean.class);
    	
       System.out.println("Welcome Id is : "+wb.getId()); 
       System.out.println("Message from WelcomeBean is : "+wb.getMessage());
    }
}
