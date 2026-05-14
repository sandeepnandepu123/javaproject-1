package com.PaymentProcessingSystem;

public class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("paid $$"+amount+"by upi payment");
    }
}
