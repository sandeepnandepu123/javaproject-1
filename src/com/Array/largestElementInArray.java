package com.Array;

public class largestElementInArray {
    public static void main(String[] args) {
        int number[] = {12,44,78,34,109,113,226};
        int max = number[0];
        for (int i = 0; i<number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
            System.out.println("Max numbers is :"+max);

    }
}
