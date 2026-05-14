package com.PaymentProcessingSystem;

public class CurrentAccount extends Account {

    public CurrentAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    void calculateIntrest() {
        System.out.println("current account don't provide interest");
    }
}
