package com.ExceptionHandling;

import static java.lang.Class.forName;

class A{
    public void show() throws ClassNotFoundException {
        Class.forName("Calc");
    }

}
public class Throws {
    static {
        System.out.println("class Loaded");
    }
    public static void main(String[] args) {
        A a = new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
