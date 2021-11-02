package com.collection.class24.task4;

public class Task4 {
    private  void sayHello() {
        System.out.println("Hello there");
    }

    private void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    private void sayHello(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("ksbfk",5);

//break till 8:35
    }
}
