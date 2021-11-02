package com.collection.class19;

public class Task1 {
    /*
    Write a program that will have a constructor:
    one with parameters and second without any parameters.
     Create a separate Test class where you will execute both
     of the constructors 1 by 1.
     */
    String address;
    Task1(){
        System.out.println("No argument constructor");
    }
    Task1(String address){
        System.out.println("argument constructor");
        this.address=address;
    }
}
