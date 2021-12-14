package com.collection.class29.arraylistdemoa;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> nunbers = new ArrayList<>();
        nunbers.add(10.2);
        nunbers.add(12.0);
        nunbers.add(135.0);
        System.out.println(nunbers.size());
        System.out.println(nunbers);
        nunbers.set(1, 120.0);
        System.out.println(nunbers);
        System.out.println(nunbers.get(2));

        nunbers.remove(1);
        System.out.println(nunbers);
        for (Double number : nunbers) {
            System.out.println(number);
        }
        System.out.println(nunbers);
        for (int i = 0; i < nunbers.size(); i++) {
            nunbers.set(i, nunbers.get(i) * 2);
        }
        System.out.println(nunbers);
    }
}
