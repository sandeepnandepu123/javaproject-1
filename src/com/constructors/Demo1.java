package com.constructors;

class P {
    P(){
        System.out.println("parent class default constructor");
    }
    P(int p){
        System.out.println("parent class constructor with one argument");
    }

}
class C extends P {
    C(){
        System.out.println("child class default constructor");
    }
    C(int c){
//        super(c);
        this();
        System.out.println("child class constructor with one argument");
    }
    C(Car c){
        super(10);
        System.out.println("child class constructor with car class argument");
    }

}


public class Demo1{
    public static void main(String[] args) {
        C c = new C(10);
        Car car = new Car();
        C c1 = new C(car);

    }
}