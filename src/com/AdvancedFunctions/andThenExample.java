package com.AdvancedFunctions;

import java.util.function.Function;

public class andThenExample {
    public static void main(String[] args) {
        Function<Integer,Integer> f1 = x-> x * 3;
        Function<Integer,Integer> f2 = x-> x + 5;

        Function<Integer,Integer> f3 = f1.andThen(f2);
        int result = f3.apply(33);
        System.out.println("Result of andThen method is :" +result);
    }
}
