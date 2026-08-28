package com.tca.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
     
	@Value("${admin.url}")
	private String adminURL;
	
	@Value("${admin.port}")
	private String port;
	
	@Value("${admin.userName}")
	private String userName;
	
	@Value("${admin.password}")
	private String password;
	
	public void printInformation() {
		System.out.println("URL "+adminURL);
		System.out.println("Port : "+port);
		System.out.println("admin :"+userName);
		System.out.println("password : "+password);
	}
	
}
