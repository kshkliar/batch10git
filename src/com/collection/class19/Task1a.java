package com.collection.class19;

public class Task1a {
    /*
    Write a program that will have a constructor:
    one with parameters and second without any parameters.
     Create a separate Test class where you will execute both
     of the constructors 1 by 1.
     */
  String address;

  Task1a() {
    System.out.println("Not argument constructor");
  }

  Task1a(String address) {
    System.out.println("Constructor with argument");
    this.address=address;
  }
}
