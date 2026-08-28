package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tca.bean.Customer;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Customer cust = context.getBean(Customer.class);
        
        System.out.println("Customer id is : "+cust.getCustomerId());
        System.out.println("Customer name is : "+cust.getName());
        System.out.println("Customer Address is : City is "+cust.getAddress().getCity());
        System.out.println("                      Pincode is " +cust.getAddress().getPincode());
    }
}
 