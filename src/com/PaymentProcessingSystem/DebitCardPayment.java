package com.PaymentProcessingSystem;

public class DebitCardPayment extends Payment {

    DebitCardPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("paid $$"+amount+"using debit card payment");
    }
}
