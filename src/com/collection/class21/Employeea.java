package com.collection.class21;

public class Employeea extends Persona{
    String emId;
    double salary;

    void work() {
        System.out.println("Employee "+emId+ " having age "+""+age+" is working");
    }

    void getPaid() {
        System.out.println(emId+" is paid "+salary);
    }
}