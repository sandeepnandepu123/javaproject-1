package com.Streams;

import java.util.function.Function;

public class StreamsExample1 {
    public static void main(String[] args) {
        Function<Integer,Boolean> function = StreamsExample1::isEven;
        boolean value = function.apply(21);
        System.out.println("IsEven value is :" +value);
        f1(function);
        Function<Integer,Boolean> function1 = func();
        System.out.println("Returning a func from another func :" +function1);

        Consumer<String> fun1 = (s)->System.out.println("Message :" +s);
        f2(fun1,"Hello user..);
        f2(fun1,"welcome to java");

    }
    public static boolean isEven(int b){
        return b % 2 ==0;
    }
    public static void f1(Function<Integer,Boolean> function){
        boolean returnValue = function.apply(20);
        System.out.println(returnValue);
    }
    public static Function<Integer,Boolean> func (){
        return StreamsExample1::isEven;
    }
    public static void f2(Consumer<String> fun,String msg){
        fun.accept(msg);
    }



}
