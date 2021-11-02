package com.collection.class27.demo1;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("BMW","X5","123","Sedan");
        bmw.drive();
        bmw.start();
        bmw.stop();
       // bmw.toString(); coming from Object class all the classes are automatically
        //inherit from that class.
        bmw.displayInfo();
        Vehicle.displayTotalVehicles();
        //break till 11:40;
        Car car=new Toyota("Toyota","Yaris","Sedan","456");
        ((Toyota)car).displayInfo();
    }
}
