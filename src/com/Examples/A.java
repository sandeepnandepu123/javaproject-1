package com.Examples;

public class A {
    B b = new B();
    public int f1(int x){
        System.out.println("Inside A.f1");
        return b.f2(x);

    }


    }

