package com.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;

public class MainClass  {
    public static void main(String[] args) {

        FIDemo f1 = (a,b)-> a + b;
        int result =  f1.calculation(10,30);
        System.out.println(result);

        Function<Integer,Integer> function = (a)-> a*a;
        int Result = function.apply(5);
        System.out.println(Result);

        Consumer<Boolean> consumer = (a)->

            System.out.println(" consumer takes input return nothing");




    }


}
