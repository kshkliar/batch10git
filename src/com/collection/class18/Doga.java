package com.collection.class18;

public class Doga {
    String name;
    int age;
    double height;
    double weight;
    String breed;
    String color;
    static int noOfLegs = 4;

    Doga() {
        name = "None";
        age = 10;
        height = 10;
        weight = 10;
        breed = "None";
        color = "None";
    }

    Doga(String dogName) {
        //constructor 1
        name = dogName;
        age = 10;
        height = 10;
        weight = 10;
        breed = "None";
        color = "None";
    }
    Doga(String dogName,int dogAge) {
        //constructor 2
        name = dogName;
        age=dogAge;
        height = 10;
        weight = 10;
        breed = "None";
        color = "None";
    }
    Doga(String dogName,int dogAge, double dogheight) {
        //constructor 2
        name = dogName;
        age=dogAge;
        height=dogheight;
        weight = 10;
        breed = "None";
        color = "None";
    }
    Doga(String dogName,int dogAge,double dogheight,double dogWeight){
        //constructor 3
        name=dogName;
        age=dogAge;
        height=dogheight;
        weight=dogWeight;
        breed="None";
        color="None";
    }
    Doga(String dogName,int dogAge,double dogheight,double dogWeight,String dogBreeed){
        //constructor 3
        name=dogName;
        age=dogAge;
        height=dogheight;
        weight=dogWeight;
        breed=dogBreeed;
        color="None";
    }
    Doga(String dogName,int dogAge,double dogHeight,double dogWeight,String dogBreed,String dogColor){
        name=dogName;
        age=dogAge;
        height=dogHeight;
        weight=dogWeight;
        breed=dogBreed;
        color=dogColor;
    }
    void printDogInfo(){
        System.out.println("Name "+name+" Age "+age+" Height "+height+" Breed "+breed+" color "+ color);
    }


}

