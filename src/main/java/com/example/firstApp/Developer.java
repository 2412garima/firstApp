package com.example.firstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //tells Spring that this class is a Spring managed bean
public class Developer {

    @Autowired  // tells Spring to give object of Laptop
    private Laptop lap;

    public void build()
    {
        lap.compile();
        System.out.println("Building a java project");
    }
}
