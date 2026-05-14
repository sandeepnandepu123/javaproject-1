package com.PaymentProcessingSystem;

public class SavingsAccount extends Account {


    public SavingsAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    void calculateIntrest() {
        double intrest = balance * 0.05;
        balance = balance+intrest;
        System.out.println("intrest added to the amount is :"+intrest);
    }
}
