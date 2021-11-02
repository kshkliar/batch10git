package com.collection.class18;

public class Persona {
    String name;
    int age;
    String country;
   /* Person(){
        System.out.println("Inside the constructor of Person");
    }*/

    void printInfo(){
        System.out.println("Name "+name+" Age"+age+" Country "+country);
    }
Persona(String personName, int personAge, String personCountry){//конструктор
       name=personName;
       age=personAge;
       country=personCountry;
}

}
