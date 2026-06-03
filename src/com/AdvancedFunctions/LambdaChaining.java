package com.AdvancedFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaChaining {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("java","python","springBoot","microservices","spring");
        List<String> names = stringList.stream().filter(string->string.length()>4)
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(names);

    }
}
