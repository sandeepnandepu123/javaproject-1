package com.PaymentProcessingSystem;

public class Main {
    public static void main(String[] args) {
        Account account = new SavingsAccount("chris","203477645382",56000.56);
        Account account1 = new CurrentAccount("max","203254885943",76000.23);

        account.displayBalance();
        account.calculateIntrest();
        account.displayBalance();

        account1.displayBalance();
        account1.calculateIntrest();

        Payment p1 = new CreditCardPayment(40000);
        Payment p2 = new DebitCardPayment(35000);
        Payment p3 = new UPIPayment(30000);

        p1.makePayment();
        p2.makePayment();
        p3.makePayment();
    }
}
