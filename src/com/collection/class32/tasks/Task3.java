package com.collection.class32.tasks;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
/*Create a collection of integers in which you can keep duplicates.

        Write a logic to find sum of all integers*/
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);

        int sum = 0;
        for (Integer number : arrayList
        ) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
