package com.tca;

import com.tca.bean.GreateBean;
import com.tca.bean.WelcomeBean;
import com.tca.bean2.A;
import com.tca.bean2.HelloBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    static HelloBean helloBean;
    public static void main(String[] args) {
       ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
       System.out.println("Container name :" +context.getClass().getName());
       A a = context.getBean(A.class);
       a.methodA();
       a.methodC();
    }

}
