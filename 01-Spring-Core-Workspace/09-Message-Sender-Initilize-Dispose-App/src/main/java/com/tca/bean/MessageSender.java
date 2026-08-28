package com.tca.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageSender implements InitializingBean,DisposableBean {
     
	 private String serverIp;
	 private int serverPort;
	
	 
	 
	 public void setServerIp(String serverIp) {
		 this.serverIp = serverIp;
		 
		 System.out.println("The server Ip is "+serverIp);
	 }
	 public void setServerPort(int serverPort) {
		 this.serverPort = serverPort;
		 
		 System.out.println("Thi server Port is :" +serverPort);
	 }
	 @Override
	 public void afterPropertiesSet() throws Exception {
		
		 System.out.println("Sending the message to the server Ip ["+serverIp+"] with Port ["+serverPort+"]");
		
	 }
	 
	 public void send() {
		 System.out.println("message is sending ..........");
	 }
	 @Override
	 public void destroy() throws Exception {
		
		 System.out.println("we are Disconnecting the server ");
		
	 }
	 
	 public void myInit() {
		 System.out.println("This is custome method to initilize the server");
	 }
	 
	 public void myDestroy() {
		 System.out.println("This is custome distroying method ");
	 }
	 
	 
}
