package com.tca.entities;

public class ServiceA {
	private ServiceB serviceB2;
    private ServiceC serviceC; 
	
	public ServiceA(ServiceB serviceB2) {

		this.serviceB2 = serviceB2;
		this.serviceC = serviceC;
		System.out.println("This is A's Constructor");
		serviceB2.display();
	}

	public ServiceA() {
		
	}

	public ServiceB getServiceB() {
		return serviceB2;

	}

	public void setServiceB(ServiceB serviceB) {

		this.serviceB2 = serviceB;
		System.out.println("This is serviceB's Setter method");
		serviceB.display();
	}


	public void setServiceC(ServiceC serviceC) {
		this.serviceC = serviceC;
		System.out.println("This is Setter method for serviceC");
		serviceC.display();
	}
	
	

}
