package com.ExceptionHandling;

public class Demo1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String name = null;

        try {
            y = 10 / x;
            System.out.println(name.length());

        }
        catch (ArithmeticException e){
            System.out.println("Result is :");
            e.getMessage();
        }
        catch (NullPointerException e){
            e.getMessage();

        }
        System.out.println(y);
        System.out.println("ArithmeticException Handled..");
        System.out.println("NullPointerException handled..");
    }
}
