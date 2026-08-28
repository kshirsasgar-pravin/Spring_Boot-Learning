package com.tca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.tca.service.ServiceB;

@Configuration
@ComponentScan("com.tca.service")
public class AppConfig {

	   @Bean
	   public ServiceB getB() {
		   System.out.println("this is the bean method ");
		   return new ServiceB();
	   }
}
