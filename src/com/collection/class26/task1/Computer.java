package com.collection.class26.task1;

public class Computer {
    int MainMemory;
    double price;
    String make;
    Computer(){
        System.out.println("Parent");
    }
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.

     */
    void browseInternet(){
        System.out.println("You can browse internet on COmputer");
    }
    void openFiles(){
        System.out.println("You can open different files on a Computer");
    }

}
class Apple extends Computer{

    Apple(){
        System.out.println("Apple");
    }
    void useItunes(){
        System.out.println("you can use ITunes");
    }

    void browseInternet(){
        System.out.println("You can browse internet on Apple using Safari");
    }
}
class Lenovo extends Computer{
Lenovo(){
    System.out.println("Lenovo");
}
    void VantageApp(){
        System.out.println("Use vantage app to customize me");
    }
    void browseInternet(){
        System.out.println("You can browse internet on Apple using GoogleChrome");
    }
}
class HP extends Computer{
    HP(){
        System.out.println("HP");
    }
    void HPSmartApp(){
        System.out.println("Use HPSmartApp app to customize me");
    }
    void browseInternet(){
        System.out.println("You can browse internet on Apple using Firefox");
    }
}
class Dell extends Computer{
    Dell(){
        System.out.println("Dell");
    }
    void DellSupportApp(){
        System.out.println("Use DellSupportApp app to customize me");
    }
    void browseInternet(){
        System.out.println("You can browse internet on Apple using IE");
    }
}
