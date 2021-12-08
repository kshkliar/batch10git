package com.collection.class22;

public class Doga extends Animala {
    int noOfLegs = 4;

    void eat() {
        System.out.println("Dogs like to eat meat");
    }

    void activities() {
        sleep();
        eat();
        super.eat();
    }

    private void sleep() {
        System.out.println("Dog can sleep");
    }

    void printLegs() {
        System.out.println(noOfLegs);
        System.out.println(super.noOfLegs);
    }

    public static void main(String[] args) {
        Doga dog = new Doga();
        dog.printLegs();
        dog.activities();
    }
}

