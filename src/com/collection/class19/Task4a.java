package com.collection.class19;

public class Task4a {
String name;
String address;


    Task4a(String name, String address) {
        this(name);
        this.address=address;
     //   this.name=name;
        System.out.println("Constructor 2");
    }
    Task4a(String name) {
        this.name=name;
        System.out.println("Constructor 1");
    }


}
