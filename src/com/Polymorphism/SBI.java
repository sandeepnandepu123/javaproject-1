package com.Polymorphism;

public class SBI implements Itransaction {
    private double balance;

    public SBI(double Initialbalance) {
        this.balance = Initialbalance;
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("SBI Account Deposite : " + amount);
        } else
            System.out.println("Invalid deposit amount");

    }

    @Override
    public void WithDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("SBI Account Withdrawal is : " + amount);
        } else {
            System.out.println("Insufficient balance");

        }
    }

        @Override
        public double getBalance () {
            System.out.println("SBI Current balance is :" +balance);
            return balance;

    }
}
