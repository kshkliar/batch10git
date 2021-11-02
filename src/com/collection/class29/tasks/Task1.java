package com.collection.class29.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways.

         */

        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW M3");
        cars.add("Honda Civic");
        cars.add("Toyota CHR");
        cars.add("hyundai tucson");
        cars.add("Lucid");
        System.out.println("=====================");
        //when only accessing the elements always use enhanced for loop
        for (String car:cars
             ) {
            System.out.println(car);
        }
        System.out.println("=====================");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("=====================");
        Iterator<String> iterator=cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
