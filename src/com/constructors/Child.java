package com.constructors;

  public class Child extends Parent {

        Child(){
            super(15);
            System.out.println("child class default constructor");
            this.x = 20;
        }
        Child(int b,int c){
            super(b,c);
            System.out.println("child class constructor with single argument");
            this.x = b;
        }

        Child(Car c){
            super(10);
            System.out.println("child class constructor with car class arguments");
        }
        Child(Bike b){
            super(50);
            System.out.println("child class constructor with bike class arguments");
        }

        public int f5(){
            return this.x;
        }
    }

