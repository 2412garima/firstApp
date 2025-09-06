package com.example.firstApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public void compile()
    {
        System.out.println("Few errors found using laptop");
    }
}
