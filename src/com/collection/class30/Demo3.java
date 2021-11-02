package com.collection.class30;

import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
        HashMap<String, Double> groceries = new HashMap<>();
        groceries.put("Egg", 12.0);
        groceries.put("tomato", 5.5);
        groceries.put("milk", 2.5);
        groceries.put("potato", 4.2);
        groceries.put("steak", 3.5);
        System.out.println(groceries);
        groceries.put(null, null);
        groceries.put("shirt", null);
       // groceries.put(null, 5.0);
        groceries.put("Orange", null);
        groceries.replace("milk", 5.5);
        System.out.println(groceries);
        System.out.println(groceries.containsKey("potato"));
        System.out.println(groceries.isEmpty());
    }
}
