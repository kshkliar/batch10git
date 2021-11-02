package com.collection.class25.catingdemo;

public class Father {
    String name;
    private double money;
    Father(String name){
        this.name=name;
    }
    void sleep(){
        System.out.println(name+" like to sleep 5 hour");
    }
    void eat(){
        System.out.println(name+" like to eat eggplant");
    }
}
