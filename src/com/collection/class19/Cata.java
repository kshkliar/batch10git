package com.collection.class19;

public class Cata {
   String name;
   int age;
   double height;
   double weight;

    Cata(String name, int age, double height, double weight) {
       this.name=name;
       this.age=age;
       this.height=height;
       this.weight=weight;
       this.printInfo();
    }
    void printInfo(){
     String name="Local vari";//локальная переменная+ переменная конструктора
        System.out.println(name+ " Name "+this.name+ " Age "+ age+
                " Height "+height+ " Weight "+weight);
    }
}
