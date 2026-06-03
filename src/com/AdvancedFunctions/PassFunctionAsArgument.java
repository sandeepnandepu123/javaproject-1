package com.AdvancedFunctions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PassFunctionAsArgument {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = PassFunctionAsArgument::add;
        int result = biFunction.apply(456,655);
        System.out.println("Result of function as argument is :" +result);

    }

    public static int add(int x,int y){
        return x+y;
    }
}
