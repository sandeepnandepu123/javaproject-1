package com.constructors;

public class Parent {
        int x = 10;
        int y = 20;
        //
//    Parent(){
//        System.out.println("parent class default constructor");
//        this.x = 20;
//    }
        Parent(int a){
            System.out.println("parent class constructor with single argument");
            this.x = a;
        }
        Parent(int a,int b){
            this(a);
            System.out.println("parent class constructor with two arguments");
            this.x = a;
            this.y = b;
        }


        public int f4(){
            return this.x;
        }
    }

