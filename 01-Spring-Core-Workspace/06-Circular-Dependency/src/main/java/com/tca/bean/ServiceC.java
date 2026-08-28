package com.tca.bean;

public class ServiceC {
      private ServiceA serviceA ;

	  public ServiceC(ServiceA serviceA) {
		
		this.serviceA = serviceA;
	  }
	  
	  public void print() {
		  System.out.println("This is ServiceC's print method ");
		  
	  }
      
      
}
