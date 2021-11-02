package com.collection.class23.superdemo;

public class Parent {
    String name="akbulut";

    void printName(){
        System.out.println("Name is "+name);
    }
    void getMarried(){
        System.out.println("my children will get marry by my choice");
    }
}

class Child extends Parent{
    String name="Enes";
    void printName(){
        String name="Tesfaab";
        System.out.println("Name is "+name);
        System.out.println("Name is "+this.name);
        System.out.println("Name is "+super.name);
    }
    void getMarried(){
        System.out.println("But i like someone else");
    }
    void letsDoSomethingCrazy(){
        getMarried();
        this.getMarried();
        super.getMarried(); // we can have methods and fields on the second line as well
    }

}

