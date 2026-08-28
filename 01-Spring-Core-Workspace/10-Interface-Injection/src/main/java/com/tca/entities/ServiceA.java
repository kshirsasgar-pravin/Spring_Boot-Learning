package com.tca.entities;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ServiceA implements BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean  {
     private String message;
     private String myBeanName;
     private ApplicationContext context;
     
     public ServiceA() {
    	 System.out.println("Creationg of Bean..........");
     }

	 public void setMessage(String message) {
		 this.message = message;
	 }

	 public void setMyBeanName(String myBeanName) {
		 this.myBeanName = myBeanName;
	 }

	 public void setContext(ApplicationContext context) {
		 this.context = context;
	 }
	 
	 
	 public void printMessage() {
		System.out.println("this is Service method "+message);
	 }

	 @Override
	 public void destroy() throws Exception {
		System.out.println("Destroing the Bean : destroy()");
		
	 }

	 @Override
	 public void afterPropertiesSet() throws Exception {
		 System.out.println("Intializing Bean - afterPropertiesSet");
		
	 }

	 @Override
	 public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		 this.context = context;
		
	 }

	 @Override
	 public void setBeanName(String name) {
		 System.out.println("Bean name is : "+name);
		 myBeanName = name;
		
	 }
     
     
}
