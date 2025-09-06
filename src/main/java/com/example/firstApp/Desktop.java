package com.example.firstApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //tells Spring to give this object if multiple classes implementing Computer
//but @Primary can be used with only one class
public class Desktop implements Computer{

    public void compile()
    {
        System.out.println("Few errors found using desktop");
    }
}
