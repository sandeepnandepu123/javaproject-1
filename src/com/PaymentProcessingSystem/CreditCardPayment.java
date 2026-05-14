package com.PaymentProcessingSystem;

public class CreditCardPayment extends Payment {
    CreditCardPayment(double amount){
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("paid $$" +amount+ "using credit card payment");
    }

}
