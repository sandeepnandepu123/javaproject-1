package com.Examples;

public class passByValueExample {
    public static void main(String[] args) {
        int a = 1000;
        System.out.println("value of a is :" + a);

        int b;
        b = a;
        System.out.println("value of b is :" + b);

        b = 2000;
        System.out.println("changed value of b is to 2000");
        System.out.println("value of b is :" + b);

        System.out.println("value of a is : "+ a);

    }
}
