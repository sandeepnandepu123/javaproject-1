package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsExample {
    public static void main(String[] args) {
        Function<Integer,Integer> function = n->n*3;
        Predicate<Integer> predicate = n->n>30;
        List<Integer> integers = Arrays.asList(10,15,20,25,30,35,40,45,50,55,60,65,70);
        integers.stream().map(n->n*5).filter(n->n>30).forEach( System.out::println);

        integers.stream().map(function).filter(predicate).forEach(System.out::println);
    }
}
