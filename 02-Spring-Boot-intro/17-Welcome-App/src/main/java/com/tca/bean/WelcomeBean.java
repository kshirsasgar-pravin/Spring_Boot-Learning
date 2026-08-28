package com.tca.bean;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBean {
    public WelcomeBean() {
        System.out.println("Welcome Bean is created");
    }
    public void display(){
        System.out.println("Welcome to the Welcome Bean");
    }
}
