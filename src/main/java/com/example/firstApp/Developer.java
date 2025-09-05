package com.example.firstApp;

import org.springframework.stereotype.Component;

@Component //tells Spring that this class is a Spring managed bean
public class Developer {

    public void build()
    {
        System.out.println("Building a java project");
    }
}
