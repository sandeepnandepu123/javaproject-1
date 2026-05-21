package com.Polymorphism;

public class HDFC implements Itransaction {
    private double balance;

    public HDFC(double balance) {
        this.balance = balance;
    }

    @Override
    public void Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("HDFC Account Deposite :" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void WithDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("HDFC Account Withdrawl is : " + amount);
        }
        else
        System.out.println("Insifficient balance");

    }


      @Override
      public double getBalance() {
          System.out.println("HDFC Current balance is :" +balance);
          return balance;
    }
}
