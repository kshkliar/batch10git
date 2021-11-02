package com.collection.class21;

import com.collection.class20.Developer;

import javax.swing.*;

public class Person {
    private String name;
    int age;
    protected double height;
    public double weight;

    public void sleep(){
         System.out.println("Person is sleeping");
     }
    protected void eat(){
         System.out.println("Person is eating");
     }
     private void walk(){
         System.out.println("Person can walk");
     }
    public static void run(){
         System.out.println("person can run");
     }
}
