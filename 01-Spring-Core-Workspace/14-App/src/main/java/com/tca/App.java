package com.tca;


import java.security.Provider.Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tca.config.AppConfig;
import com.tca.service.ServiceA;
import com.tca.service.ServiceB;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
     
    }
}
