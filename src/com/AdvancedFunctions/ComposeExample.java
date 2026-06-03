package com.AdvancedFunctions;

import java.util.function.Function;

public class ComposeExample {
    public static void main(String[] args) {
        Function<Integer,Integer> function = y->y+5;
        Function<Integer,Integer> function1 = y->y-3;

        Function<Integer,Integer> functionResult = function.compose(function1);
        int result = functionResult.apply(45);
        System.out.println("Result is :" +result);
    }
}
