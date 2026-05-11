package com.Array;

public class AlternateElements {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0 ; i<number.length ; i+=2){
            System.out.println(number[i]);
        }
    }
}
