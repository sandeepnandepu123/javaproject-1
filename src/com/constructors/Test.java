package com.constructors;

  public class Test {
        public static void main(String[] args) {
            Child c = new Child(10,30);
            System.out.println(c.x);
            System.out.println(c.y);
            c.f4();
            c.f5();

            Car car1 = new Car();
            Child c1 = new Child(car1);

            Bike b = new Bike();
            Child c2 = new Child(b);
            



        }
    }

