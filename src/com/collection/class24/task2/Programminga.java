package com.collection.class24.task2;

public class Programminga {
    /*
    Create a class named 'Programming'.
    While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages"
     should be printed. If some String is passed to it, then in place of "programming
     languages" the value variable should be printed. Example, if we pass "Java", then
     "I love Java" should be printed.
     */
    Programminga() {
        System.out.println("Ilove programming languages");
    }

    Programminga(String value) {//constractor 2
        System.out.println(" I love"+ value);
    }

    public static void main(String[] args) {
        new Programminga();
        new Programminga("Python");
    }
}
