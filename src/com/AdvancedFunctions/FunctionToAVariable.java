package com.AdvancedFunctions;

import java.util.function.Function;

public class FunctionToAVariable {
    public static void main(String[] args) {
        Function<Integer,Boolean> function = i->i%2==0;
        System.out.println(function.apply(12));
        System.out.println(function.apply(17));

    }
}
