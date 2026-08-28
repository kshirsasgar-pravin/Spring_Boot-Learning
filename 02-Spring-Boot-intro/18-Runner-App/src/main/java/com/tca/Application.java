package com.tca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        for(String s : args){
            System.out.println(s);
        }

        SpringApplication.run(Application.class, args);
    }

}
