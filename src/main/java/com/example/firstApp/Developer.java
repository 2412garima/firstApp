package com.example.firstApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //tells Spring that this class is a Spring managed bean
public class Developer {

    @Autowired  // tells Spring to give object of Laptop, it is Field injection
//    private Laptop lap;
    private  Computer comp;

//    //Constructor Injection, @Autowired comes by default
//    public Developer(Laptop lap) {
//        this.lap = lap;
//    }
//
//    //Setter injection, need to add @Autowired
//    @Autowired
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }


    public void build()
    {
        comp.compile();
        System.out.println("Building a java project");
    }
}
