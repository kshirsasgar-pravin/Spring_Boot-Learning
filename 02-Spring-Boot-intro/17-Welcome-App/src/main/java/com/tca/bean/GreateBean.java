package com.tca.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreateBean {

    @Autowired
    WelcomeBean welcomeBean;
    public GreateBean() {
        System.out.println("Greate Bean is created");

    }
    public  void great(){
        welcomeBean.display();
    }
}
