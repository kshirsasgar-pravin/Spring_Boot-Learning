package com.tca.bean;

public class ServiceA {
     private ServiceB serviceB;
     private ServiceC serviceC;
     
	



	 public void setServiceC(ServiceC serviceC) {
		 this.serviceC = serviceC;
	 }




	 public void setServiceB(ServiceB serviceB) {
		this.serviceB = serviceB;
		
	}




	 public void display() {
		 
		 System.out.println("Service A chi display method ");
		 serviceB.show();
		 serviceC.print();
		 
	 }
     
}
