package com.collection.class19;

public class Cat {
    String name;
    int age;
    double height;
    double weight;

    Cat(String name,int age,
        double height,double weight){
        this.name=name;
        this.age=age;
        this.height=height;
       this.weight=weight;
       this.printInfo();
    }

    void printInfo(){
        String name="Local var";
        System.out.println(name+" Name "+this.name+" Age "+age+
                " Height "+height+" Weight "+weight);
    }
}
