package com.collection.class22;

public class Persona {
    String name;
    int age;
    double height;
    double weight;
    Persona(String name, int age, double height ){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;

    }
    Persona(String name, int age, double height, double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;

    }
    public void eat(){
        System.out.println(name+" can eat");
    }
    public void sleep(){
        System.out.println(name+" sleeps all the time");
    }
}
