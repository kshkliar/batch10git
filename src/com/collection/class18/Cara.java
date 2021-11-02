package com.collection.class18;

public class Cara {

    String model;
    String make;
    int year;
    String color="White";

    Cara(String carModel, String carMake, int carYear) {
        model=carModel;
        make=carMake;
        year=carYear;
    }

    void printCarInfo() {
        System.out.println("Model " + model + " Make " + make + " Year " + year);
    }

    String printInfoWithStr() {
        return "Model " + model + " Make " + make + "Year " + year;}
}
