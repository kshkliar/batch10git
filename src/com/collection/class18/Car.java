package com.collection.class18;

public class Car {
    String model;
    String make;
    int year;
    String color="White";

    Car(String carModel,String carMake,int carYear){
        model=carModel;
        make=carMake;
        year=carYear;
    }

    void printCarInfo(){

        System.out.println("Model "+model+" Make "+make+" Year "+year);
    }
    String printInfoWithStr(){
        return "Model "+model+" Make "+make+" Year "+year;
    }
}
