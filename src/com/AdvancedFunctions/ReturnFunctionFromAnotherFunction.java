package com.AdvancedFunctions;

import java.util.function.BiFunction;

public class ReturnFunctionFromAnotherFunction {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder = getAdder();
        int value = adder.apply(250,100);
        System.out.println("Result of function from function is :" +value);

    }

    public static BiFunction<Integer,Integer,Integer> getAdder(){
        return (a,b)->a-b;
    }

}
