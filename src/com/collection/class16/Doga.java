package com.collection.class16;

public class Doga {
    static int noOfLegs=4;
    String name;  //instance variable
     String Breed; // static variable
    String color;


    static void bark(){
        int times=10; // local variable
        for (int i = 0; i < times; i++) {
            System.out.println("Dog can bark");
        }
    }
}
