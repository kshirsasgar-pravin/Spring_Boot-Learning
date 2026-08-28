package com.tca.bean2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

      @Autowired
       B b;
      public void methodA(){

         b.methodB();
          System.out.println(b);
      }
      public void methodC(){
          System.out.println("This is testing method");
      }
}
