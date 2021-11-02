package com.collection.class29.arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.2);
        //numbers.add(10); No auto conversion from int to double
        numbers.add(12.0);
        numbers.add(135.0);
        System.out.println(numbers.size());
        System.out.println(numbers);
        numbers.set(1,120.0);
        System.out.println(numbers);
        System.out.println(numbers.get(2));
        //numbers.remove(120.0);
         numbers.remove(1);
        System.out.println(numbers);
        for (Double number:numbers
             ) {
            System.out.println(number);
        }
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,numbers.get(i)*2);
        }
        System.out.println(numbers);
    }
}
