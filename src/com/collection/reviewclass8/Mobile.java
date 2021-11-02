package com.collection.reviewclass8;

public class Mobile {
    private String make;
    String model;
    protected int mainMemory;
    public int secondaryMemory;

  public Mobile(String make, String model, int mainMemory, int secondaryMemory) {
        this.make = make;
        this.model = model;
        this.mainMemory = mainMemory;
        this.secondaryMemory = secondaryMemory;

    }

    private void printInfo() {
        System.out.println(make + model + mainMemory);
    }

    protected void printModel() {
        System.out.println(model);
    }

    protected static void printHello() {
        System.out.println("Hello");
    }

   public void printMake() {
        System.out.println(make);
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("Iphone", "samsung", 8, 512);
        mobile.printInfo();
    }
}

class MobileTester {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Iphone", "samsung", 8, 512);
    }
}
