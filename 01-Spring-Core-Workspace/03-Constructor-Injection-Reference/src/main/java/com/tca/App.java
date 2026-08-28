package com.tca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new  ClassPathXmlApplicationContext("config.xml");
        
        Customer cust = context.getBean(Customer.class);
        
        System.out.println("Customer Id :" + cust.getCustomerId());
        System.out.println("Customer Name : " + cust.getCustomerName());
        System.out.println("Customer Address :");
        System.out.println("                   City : " +cust.getAddress().getCity());
        System.out.println("                   Pincode : "+cust.getAddress().getPincode());
    }
}
