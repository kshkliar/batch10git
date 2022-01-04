package com.collection.class22;

public class Dog extends Animal{
    int noOfLegs=4;
    void eat(){
        System.out.println("Dogs like to eat meat");
    }
    void activities(){
        sleep();
        eat();
        super.eat();// to call the values from parent class
    }
    //because we use super fields fields or method of parent class is called if the sane name od field/method exist
    void sleep(){
        System.out.println("Dog can sleep");
    }
    void printLegs(){
        System.out.println(noOfLegs);
        System.out.println(super.noOfLegs);// noOfLegs from parent class are prefered
    }
    public static void main(String[] args) {
        Dog dog=new Dog();
        // dog.printLegs();
      //  dog.activities();
    }
}
