package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bike")
@Primary
public class Bike implements Vehicle{

    @Override
    public void move (){
        System.out.println("Bike is moving ..");
    }
}
