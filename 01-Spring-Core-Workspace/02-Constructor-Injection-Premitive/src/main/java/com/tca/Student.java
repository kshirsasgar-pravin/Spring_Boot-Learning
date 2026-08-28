package com.tca;

public class Student {
      private String message;
      private int id;
      
      public Student(int id ,String message) {
    	  this.id = id;
    	  this.message = message;
      }
      public String getMessage() {
    	  return message;
      }
      
      public int getId() {
    	  return id;
      }
}
