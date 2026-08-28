package com.tca.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
     
	@Value("http://admin.tca.com")
	private String adminURL;
	
	@Value("7070")
	private String port;
	
	@Value("admin")
	private String userName;
	
	@Value("root@123")
	private String password;
	
	public void printInformation() {
		System.out.println("URL "+adminURL);
		System.out.println("Port : "+port);
		System.out.println("admin :"+userName);
		System.out.println("password : "+password);
	}
	
}
