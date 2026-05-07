package com.Examples;

public class B {
    C c = new C();
    public int f2(int x){
        System.out.println("Inside b.f2");
        return c.f3(x);


    }
}
