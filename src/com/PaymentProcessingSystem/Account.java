package com.PaymentProcessingSystem;

abstract class Account {
    protected String name;
    protected String accountNumber;
    protected double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance+amount;
    }
    public void withdraw(double amount){
        balance = balance-amount;
    }

    abstract void calculateIntrest();

    public void displayBalance(){
        System.out.println("name :" +name);
        System.out.println("balance :" +balance);
    }
}
