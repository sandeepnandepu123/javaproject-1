package com.Polymorphism;

public class Male extends Human{
    @Override
    public void greet(String name) {
        System.out.println("Hi " +name+" welcome");
    }
}
