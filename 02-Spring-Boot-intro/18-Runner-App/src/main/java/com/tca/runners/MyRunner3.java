package com.tca.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner3 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("this is commandLine Runner ");
    }
}
