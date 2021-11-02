package com.collection.class27.demo2;

public class Tester {
    public static void main(String[] args) {
        Car car= new Mercedes();
        car.start();
        car.stop();
        Drivable drivable=new Mercedes();
        drivable.drive();
        ((Mercedes)drivable).start();
        //drivable.start(); Not callable on interface variable



    }
}
