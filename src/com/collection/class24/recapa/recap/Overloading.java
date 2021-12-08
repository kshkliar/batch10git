package com.collection.class24.recapa.recap;

public class Overloading {

    void sayHello() {
        System.out.println("Hello");

    }

    public static void main(String[] hgj) {
        System.out.println("Inside the main method with String[]args");
        main("Hello");
        main(10);
    }

    public static void main(String arg) {
        System.out.println("inside the main method with String arg");
    }

    public static void main(int arg) {
        System.out.println("Inside the main method with int arg");
    }
}
