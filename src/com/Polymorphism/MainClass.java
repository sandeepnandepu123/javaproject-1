package com.Polymorphism;

public class MainClass {
    public static void main(String[] args) {

//        Human human = new Human();
//        human.greet("Mike");
//
//        Human human1 = new Male();
//        human1.greet("Chris");
//
//        Human human2 = new Female();
//        human2.greet("Jenny");
//
//        Human human = null;
//        String name = "Female";
//        if (name.equals("Male")){
//            human = new Male();
//        } else if (name.equals("Female")) {
//            human = new Female();
//        }
//        human.greet("Charlie");


        Itransaction it = null;
        String bank = "HDFC";
        if (bank.equals("SBI")){
            it = new SBI(2000);
        } else if (bank.equals("HDFC")) {
            it = new HDFC(3000);
        }

        it.Deposit(2500);
        it.WithDraw(1000);
        it.getBalance();

    }
//    public Human getHuman(){
//        return new Male();   // object returning
//    }
//    public Itransaction itransaction(){
//        return new HDFC(2000);
//    }
}
