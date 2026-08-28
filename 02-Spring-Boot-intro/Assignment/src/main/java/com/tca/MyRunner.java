package com.tca;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class MyRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> keys =  args.getOptionValues("Theme-mode");
        if(keys != null && !keys.isEmpty()){
            for(String key : keys ){
                String theme = keys.get(0);
                if(theme.equals("Dark")){
                    System.out.println("Dark Mode Activated");
                } else if (theme.equals("Light")) {
                    System.out.println("Light Mode is activated");
                }
                else {
                    System.out.println("Invalide Theme");
                }
            }
        }
        else{
            System.out.println("No Theam Selected Light Mode is Activated(Default)");
        }
    }
}
