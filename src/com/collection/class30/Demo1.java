package com.collection.class30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Oxana");
        arrayList.add("Mars");
        arrayList.add("Olena");
        arrayList.add("Sharif");
        arrayList.add("Hamza");

        Map<Integer, String> map = new HashMap<>();
        map.put(111,"Ehsan");
        map.put(222, "Maria");
        map.put(333, "Olena");
        map.put(444, "sharif");
        map.put(555, "jamoliddin");
        map.put(666, "Michael");
        map.put(777, "Maria");
        map.put(111, "Olena");

        System.out.println(map.get(111));
        System.out.println(map.get(222));
    }
}
