package com.PaymentProcessingSystem;

abstract class Payment {
    protected double amount;
    Payment(double amount){
        this.amount = amount;
    }
    abstract void makePayment();
}
