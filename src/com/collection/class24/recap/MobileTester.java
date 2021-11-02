package com.collection.class24.recap;

import com.collection.reviewclass8.Mobile;

public class MobileTester extends Mobile{
    public MobileTester(String make, String model, int mainMemory, int secondaryMemory) {
        super(make, model, mainMemory, secondaryMemory);
    }

    protected static void printHello() {
        System.out.println("Hello");
    }
    public  void printInfo(){
        printModel();
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("Iphone", "samsung", 8, 512);
       // mobile.printModel();
        printHello();
    }
}
