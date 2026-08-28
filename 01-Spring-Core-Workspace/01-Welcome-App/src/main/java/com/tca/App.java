package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.WelcomeBean;

public class App {
    public static void main(String[] args) {
        
    	// Step 1 : Creating and Strting the Spring continear
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	// Step 2 : Get the Object of Bean
    	
    	WelcomeBean wc = (WelcomeBean)context.getBean(WelcomeBean.class);
    	
    	
    	// Step 3 : Call the bean method / Bussiness Logic
    	String str = wc.getMessage();
    	System.out.println(str);
    }
} 
