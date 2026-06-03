package com.AdvancedFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformationAndAggregation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        int sumOfSquares = list.stream().map(x-> x*x).reduce(0,Integer::sum);
        System.out.println(sumOfSquares);

    }
}
