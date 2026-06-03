package com.AdvancedFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChainPredicatesByMethods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,23,45,55,65,78,89,97);
        Predicate<Integer> predicate = p-> p % 2 ==0;
        Predicate<Integer> predicate1 = p->p > 10;
        Predicate<Integer> predicate2 = p->p > 20;

        Predicate<Integer> combineAll = predicate.and(predicate1).and(predicate2).negate();
        List<Integer> list1 = list.stream().filter(combineAll).collect(Collectors.toList());
        System.out.println(list1);


    }
}
