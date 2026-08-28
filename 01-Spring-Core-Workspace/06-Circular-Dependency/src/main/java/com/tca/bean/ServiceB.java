package com.tca.bean;

public class ServiceB {
          private ServiceC serviceC;
          

          public ServiceB(ServiceC serviceC) {
  			super();
  			this.serviceC = serviceC;
  		  }
          
		       
//      public ServiceB(ServiceA serviceA) {
//    	  this.serviceA = serviceA;
//    	 
//      }



		  public void show() {
        	  System.out.println("Service B chi show method ");
        	  
        	  
          }



		 


}
