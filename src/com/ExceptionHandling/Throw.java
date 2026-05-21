package com.ExceptionHandling;

public class Throw extends customException {
    public Throw(String string) {
        super(string);
    }

    public static void main(String[] args) {
       int i = 20;
       int j = 0;
       try {
           j = 18/i;
           if (j==0)
               throw new customException("Exception handled by using throw keyword");
       }
       catch (ArithmeticException e){
           j = 18/1;
           System.out.println("This is default output.." +e);
       } catch (Exception e) {
           System.out.println("something went wrong.." +e);
       }

        System.out.println(j);
        System.out.println("Exception Handled..");
    }
}
