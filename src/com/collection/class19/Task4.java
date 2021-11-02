package com.collection.class19;

public class Task4 {
    String name;
    String address;
    Task4(String name){
        this.name=name;
        System.out.println("Constructor 1");
    }

    Task4(String name,String address){
        this(name);
        this.address=address;
        System.out.println("Constructor 2");
    }
}
