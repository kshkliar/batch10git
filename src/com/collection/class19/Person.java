package com.collection.class19;

public class Person {
    String name;
    int age;
    double weight;
    double height;
    String education;
// windows Ctrl+shift+/ to comment/uncomment
// mac Cmd+shift+/ to comment/uncomment
    Person (){
        System.out.println("Important lines of code that should always be" +
                "executed when creating the object of this class");
        name="None";
        age=30;
        weight=50;
        height=5.5;
        education="None";
    }
    Person(String personName){
        this(); //calls the no argument constructor must be on first line
        System.out.println("first constructor");
        name=personName;
    }

    Person(String personName,int personAge){
       this(personName);
        System.out.println("first constructor");
        age=personAge;

    }
    void printInfo(){
        System.out.println("Name "+name+" age "+
                age+" weight "+weight+" height "+height+" education"+education);
    }
    Person(int personAge,String personName){
        System.out.println("2nd constructor");
        name=personName;
        age=personAge;
        weight=50;
        height=5.5;
        education="None";
        System.out.println("Important lines of code that should always be" +
                "executed when creating the object of this class");
    }


}
