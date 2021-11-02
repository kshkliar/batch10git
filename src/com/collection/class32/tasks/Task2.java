package com.collection.class32.tasks;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
      /* 2. Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Ukraine", "Kyiv");
        countries.put("Italy", "Rome");
        countries.put("Costa Rica", "San Jose");
        countries.put("Argentina", "Buenos Aires");
        countries.put("Colombia", "Bogota");
        countries.put("Mexico", "Mexico City");
        countries.put("New Zealand", "Wellington");

        //getting the keys only
        for (String key:countries.keySet()
             ) {
            System.out.println(key);
           /* if(key.length()>2){
                countries.remove(key); not recommended
            }*/
        }
        Iterator<String> iterator=countries.keySet().iterator();
        while (iterator.hasNext()){
            String key= iterator.next();
            if(key.length()>5){
               // iterator.remove();
            }
        }
        System.out.println(countries);

        //getting only values
        for (String value:countries.values()
             ) {
            System.out.println(value);
        }

        Iterator<String> iterator2=countries.values().iterator();
        while (iterator.hasNext()){
            String key= iterator.next();
            if(key.length()>5){
                // iterator.remove();
            }
        }

        System.out.println("=======================================================");
        Iterator<Map.Entry<String, String>> iterator1 = countries.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String,String> next=iterator1.next();
            String key=next.getKey();
            String value=next.getValue();
            System.out.println(key+" "+value);
        }


    }
}
