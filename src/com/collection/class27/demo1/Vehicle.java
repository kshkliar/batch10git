package com.collection.class27.demo1;

public abstract class Vehicle {
    String vinNumber;
    static int totalNumberOfVehicles;
    Vehicle(String vinNumber){
        this.vinNumber=vinNumber;
        totalNumberOfVehicles++;
        System.out.println("Vehicle constructor");
    }

    private void display(){

    }
    static void displayTotalVehicles(){
        System.out.println("We build "+totalNumberOfVehicles+" Vehicles");
    }
    public void drive(){
        System.out.println("we can drive Vehicle");
    }
    protected void stop(){
        System.out.println("Vehicle can stop");
    }
    public  abstract void start();
    abstract void speed();
    //public static abstract void gps(); not allowed
    //private abstract  void gps(); // not allowed
    //final abstract void gps();   // not allowed
}
abstract class Car extends Vehicle{

    String carType;
    Car(String carType,String vinNumber){
        super(vinNumber);//it should be first line in constructor;
        this.carType=carType;
        System.out.println("Car constructor");
    }
    @Override
    public void speed(){
        System.out.println("Max speed is 400");
    }
    public abstract void breaking();
}
class BMW extends Car{
    String make;
    String model;
    BMW(String make,String model,String vinNumber,String carType){
        super(carType,vinNumber);
        System.out.println("BMW constructor");
    }
    public void start(){
        System.out.println("BMW can start remotely");
    }
    public void breaking(){
        System.out.println("BMW can break");
    }
    public void displayInfo(){
        System.out.println("We build "+make+" "+model+"with car type "+
                carType+" with VinNumber"+vinNumber);
    }
}
class Toyota extends Car{
    String make;
    String model;
    Toyota(String make,String model,String carType,String vinNumber){
        super(carType, vinNumber);
        this.make=make;
        this.model=model;
    }
    public void start(){
        System.out.println("Toyota can start remotely");
    }

    public void breaking(){
        System.out.println("Toyota can break");
    }
    public void displayInfo(){
        System.out.println("We build "+make+" "+model+"with car type "+
                carType+" with VinNumber"+vinNumber);
    }
}
