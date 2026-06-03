package com.AdvancedFunctions;

import java.util.function.BiFunction;

public class PassTwoArgumentsToFunction {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (x,y)->x*y;
        int result = biFunction.apply(12,33);
        System.out.println("Result of Bifunction is : " +result);
    }
}
