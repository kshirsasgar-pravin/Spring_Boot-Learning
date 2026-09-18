package com.tca.idGenerator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;

import java.util.Random;

public class IdGenerator implements IdentifierGenerator {

    private String dept;

    public IdGenerator(StudentId studentId){
        this.dept= studentId.value();
    }

    @Override
    public Object generate(SharedSessionContractImplementor session, Object object) {

        String id = ""; 

        Random r = new Random();
        int a = r.nextInt(1,151);

        id = String.format("RBT23"+"DEPT"+"%03d", a);

        return id;
    }
}
