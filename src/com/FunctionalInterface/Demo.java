package com.FunctionalInterface;

import java.util.List;
import java.util.function.*;

public class Demo {
    public static void main(String[] args) {
        Function<Integer,Boolean> function = Demo::isEven;
        boolean result = function.apply(23);
        System.out.println(result);
        f1(function);
        Function<Integer,Boolean> booleanFunction = isEvenfun();
        System.out.println(booleanFunction);

        BiFunction<Integer,Integer,Integer> biFunction = (a,b)->a+b;
        int value = biFunction.apply(10,30);
        System.out.println(value);

        Predicate<Integer> predicate = (n)->n%2!=0;
        boolean result1 = predicate.test(22);
        System.out.println(result1);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        numbers.stream().filter(predicate).forEach(n-> System.out.println(n+ "is odd number"));

        Consumer<String> stringConsumer = c-> System.out.println("consumed");
        stringConsumer.accept("Hello consumer");

        Supplier<Double> doubleSupplier = ()-> Math.random();
        System.out.println("supplier value is :" +doubleSupplier.get());
    }
    public static boolean isEven(int b){
        return b%2==0;
    }
    public static void f1(Function<Integer,Boolean> function){
        boolean b = function.apply(44);
        System.out.println(b);
    }
    public static Function<Integer,Boolean>  isEvenfun(){
        return Demo::isEven;
    }


}
