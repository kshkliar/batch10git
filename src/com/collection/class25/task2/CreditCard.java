package com.collection.class25.task2;

public class CreditCard {

    double balance;
    double interest;
    CreditCard (double balance ){
        this.balance=balance;
    }
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
     */
    void calculateInterest(){
        interest=balance*0.15;
        System.out.println("From parent Yearly interest is "+interest);
    }
}
class Visa extends CreditCard{

    Visa(double balance) {
        super(balance);
    }
}
class AX extends CreditCard{
    AX(double balance) {
        super(balance);

    }

    void myownMwethod(){
        System.out.println("child method");
    }
    void calculateInterest(){
        interest=balance*0.10;
        System.out.println("Yearly interest is "+interest);
    }
}
