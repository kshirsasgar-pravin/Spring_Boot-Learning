package com.tca.bean;

public class Customer {
      private int customerId;
      private String name;
      private Address address;
      
	  public int getCustomerId() {
		  return customerId;
	  }
	  public void setCustomerId(int customerId) {
		  this.customerId = customerId;
	  }
	  
	  
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  
	  
	  public Address getAddress() {
		  return address;
	  }
	  public void setAddress(Address address) {
		  this.address = address;
	  }
      
      
}
