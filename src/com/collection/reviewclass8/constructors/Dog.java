package com.collection.reviewclass8.constructors;

public class Dog {
    String name;
    int age;
    double height;
    double weight;

    public Dog(){
        System.out.println("This code will be executed automatically when you create an object" +
                "of this class");
    }
    public Dog(String name) {
       this();
        this.name = name;
        System.out.println("Constructor with 1 argument");
    }
    public Dog(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("Constructor with 2 argument");
    }
    public Dog(String name, int age, double height) {
        this(name, age);
        this.height = height;
        System.out.println("Constructor with 3 argument");
    }
    public Dog(String name, int age, double height, double weight) {
        this(name, age, height);
        this.weight = weight;
        System.out.println("Constructor with 4 argument");
    }


    public static void main(String[] args) {
        Dog dog=new Dog("Tommy",10,5,15);
       // Dog dog1=new Dog();
        char a='A';
        char b='B';
        System.out.println(""+a+b);
    }
}
