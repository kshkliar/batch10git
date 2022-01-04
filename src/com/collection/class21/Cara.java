package com.collection.class21;

public class Cara {
    String model;
    String make;
    int year;

    Cara() {
        System.out.println("Empty constructor with zero parameters");
    }

    Cara(String model) {
       this();// -default constructor will be called
        this.model = model;
        this.make = "None";
        this.year = 0;
        System.out.println("Constructor with 1 parameters");
    }

    Cara(String model, String make) {
        this(model);
        this.make = make;
        this.year = 0;
        System.out.println("Constructor with 2 parameters");
    }

    Cara(String make, String model, int year) {
       this(model, make);//we reduce dublication by passing model, make, inside ()
        this.year = year;
        System.out.println("Constructor with 3 parameters");
    }

    void printInfo() {
        String hondaMake = "Honda";
        String model = "Civic";
        int year = 2022;
        System.out.println(this.model + make + this.year);
    }

}
