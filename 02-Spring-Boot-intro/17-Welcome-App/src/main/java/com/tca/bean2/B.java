package com.tca.bean2;

import org.springframework.stereotype.Component;


@Component
public class B {
    public B() {
        System.out.println("B Bean Created ");
    }

    public void methodB(){
        System.out.println("This i the method B");
    }
}
