package com.Examples;
class car{
    String name;
    float mileage;
    double cost;
}


public class passByReferenceExample {
    public static void main(String[] args) {
        car c = new car();
        c.name = "BMW";
        c.mileage = 5.7f;
        c.cost = 74;

        System.out.println(c.name);
        System.out.println(c.mileage);
        System.out.println(c.cost);
        System.out.println("");

        car b;
        b =c;
        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);

        System.out.println("");

        b.name = "TATA";
        b.mileage = 10.3f;
        b.cost = 15.3;
        System.out.println("");

        System.out.println(b.name);
        System.out.println(b.mileage);
        System.out.println(b.cost);

        System.out.println("");

        System.out.println(c.name);
        System.out.println(c.mileage);
        System.out.println(c.cost);











    }
}
