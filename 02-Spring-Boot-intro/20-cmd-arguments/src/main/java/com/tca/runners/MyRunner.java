package com.tca.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class MyRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        List<String> list = args.getNonOptionArgs();
        System.out.println(list);

        List<String> list1 = args.getOptionValues("user.name");
        System.out.println("option values " +list1);

        Set<String> keys = args.getOptionNames();
        System.out.println("keys "+keys);
    }
}
