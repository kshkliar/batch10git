package com.collection.reviewclass8;

public class MobileTester1 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Iphone", "samsung", 8, 512);
        System.out.println(mobile.secondaryMemory);
        mobile.printMake();
    }
}
