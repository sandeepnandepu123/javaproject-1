package com.Polymorphism;

public class Female extends Human{
    @Override
    public void greet(String name) {
        System.out.println("Hello " +name+" welcome");
    }
}
