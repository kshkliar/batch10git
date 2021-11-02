package com.collection.class30;

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<Double, String> employeeTable = new LinkedHashMap<>();
        employeeTable.put(1.0, "Kevin");
        employeeTable.put(2.0, "Michael Asghar");
        employeeTable.put(3.0, "Sule");
        employeeTable.put(4.0, "Olena");
        employeeTable.put(5.0, "Noor");
        System.out.println(employeeTable);

        Set<Double> mapKeys = employeeTable.keySet();
        Iterator<Double> iterator = mapKeys.iterator();

        while(iterator.hasNext()){
            Double key = iterator.next();
            System.out.println(key);
        }
    }
}
