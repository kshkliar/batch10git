package com.collection.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("Rice", 5.6);
        grocery.put("Pizza", 7.5);
        grocery.put("Steak", 10.1);
        grocery.put("Pasta", 12.1);
        grocery.put("Potato", 13.1);
        grocery.put("Beans", 13.2);
        grocery.put("Banana", 13.5);
        grocery.put("Watermelon", 15.5);

        Set<String> mapKeys = grocery.keySet();
        Iterator<String> iterator = mapKeys.iterator();

        while(iterator.hasNext()){
            String key = iterator.next();
            Double value = grocery.get(key);

            if(value<=10){
                iterator.remove();
            }
        }
        System.out.println(grocery);
    }
}
