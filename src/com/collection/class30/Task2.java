package com.collection.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1, "Maria");
        student.put(2, "Jamil");
        student.put(3, "sharif");


        student.put(4, "Ana");
        student.put(5, "olena");
        System.out.print("The size of Hashmap is "+ student.size());
        System.out.println("-------------------------");
//collection concept   values returns the collection that is why we call collection to store it
        Collection<String> values = student.values();
        for (String students : values) {
            System.out.println(students);
        }

        Set<Integer> keys = student.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
    }
}
