package com.inheritance;

class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("In A config ");
    }

}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
    public void config(){
        System.out.println("In B config");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        B b  = new B();
        b.show();
        b.config();

    }
}
