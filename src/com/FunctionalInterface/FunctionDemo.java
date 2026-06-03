package com.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,Integer> function = FunctionDemo::add;
        int result = function.apply(12);
        System.out.println("Result is :" +result);

        BiFunction<Integer,Integer,Integer> biFunction = (a,b)->a+b;
        int result1 = biFunction.apply(12,34);
        System.out.println("Result of bifunction is :" +result1);

        Function<Integer,Boolean> isEvenFunction = FunctionDemo::isEven;
        Boolean Evenresult = isEvenFunction.apply(23);
        System.out.println("The number is :" +Evenresult);

        Consumer<String> consumer = s-> System.out.println("consumed");
        consumer.accept("Hello consumer");

        Supplier<Double> supplier = ()->Math.random();
        System.out.println(supplier.get());
        System.out.println(supplier.get());

    }



    public static int add(int b){
        return 1+b;
    }
    public static Boolean isEven(int number){
        return number%2==0;
    }
}
