package com.Streams;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<String> fun1 =  (s)-> System.out.println("Message : " +s);
        f2(fun1,"Hello user...");
        f2(fun1,"welcome..");

    }

    public static void f2(Consumer<String> fun,String msg){
        fun.accept(msg);
    }
}
