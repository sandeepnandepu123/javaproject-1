package com.inheritance;

class Test{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3+1;
    }
    public double add(double n1,double n2){
        return n1-n2;
    }
}


public class MethodOverLoading {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.add(87,54));
        System.out.println(test.add(43,23));
        System.out.println(test.add(33,12,45));

    }
}
