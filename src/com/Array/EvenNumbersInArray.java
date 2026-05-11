package com.Array;

public class EvenNumbersInArray {
    public static void main(String[] args) {
        int num[] = new int[5];
        num[0] = 2;
        num[1] = 4;
        num[2] = 7;
        num[3] = 3;
        num[4] = 6;
        for (int i = 0 ;i<5; i++){
            if (num[i]%2==0){
                System.out.println(num[i]);
            }
        }

    }
}
