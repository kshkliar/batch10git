package com.collection.class27.demo2;

public class Tester {
    public static void main(String[] args) {
        Car car= new Mercedes();
        car.start();
        car.stop();
        Drivable drivable=new Mercedes();
        drivable.drive();
        ((Mercedes)drivable).start();//мы можем даункасить с интерфейсами а потом вызывать их методы
        //drivable.start(); Not callable on interface variable



    }
}
