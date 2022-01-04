package com.collection.class24.task2;

public class Programming {
    /*
    Create a class named 'Programming'.
    While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages"
     should be printed. If some String is passed to it, then in place of "programming
     languages" the value variable should be printed. Example, if we pass "Java", then
     "I love Java" should be printed.
     */
    Programming(){
        System.out.println("I love programming languages");
    }

    Programming(String value){
        System.out.println("I love "+value);
    }

    public static void main(String[] args) {
        new Programming();// we do not need this object again that is why we did not store it in variable;
        new Programming("Python");
        //new Programming(1); error because no matching constructor
    }
}
