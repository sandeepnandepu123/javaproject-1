package com.sortingorder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(101,"Ram",15),
                new Student(102,"Raj",20),
                new Student(103,"Ramu",18),
                new Student(104,"Max",24));
        Collections.sort(students);
        for (Student s : students){
            System.out.println(s);
        }

    }
}
