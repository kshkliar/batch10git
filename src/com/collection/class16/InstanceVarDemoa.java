package com.collection.class16;

public class InstanceVarDemoa {
    // Break till 1:50
    int[] arr = {10, 20, 30, 50};
    int sum=0;

    void sum() {
        for (int i : arr) {
            sum += 1;
        }
    }

    void calculateAverage() {System.out.println(sum/arr.length);}
    static void display(){
        System.out.println("Hello from the static method");

    }



}
