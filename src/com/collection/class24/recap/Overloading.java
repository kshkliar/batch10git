package com.collection.class24.recap;

public class Overloading {
    void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] ghfhfhf) {
        System.out.println("Inside the main method with String[] args");
        main("Hello");
        main(10);
    }

    public static void main(String arg) {
        System.out.println("Inside the main method with String arg");
    }

    public static void main(int arg) {
        System.out.println("Inside the main method with int arg");
    }

}
