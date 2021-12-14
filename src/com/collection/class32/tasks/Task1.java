package com.collection.class32.tasks;

import java.util.TreeMap;

public class Task1 {
    // Create a map of a building. Store floor number and it is associated company name.
// (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map
    public static void main(String[] args) {
        //we can also store TreeMap in variable of interface Map
        //we have a propertiie class not to harcode  path to cancatinate path
        TreeMap<Integer, String> building = new TreeMap<>();
        building.put(1, "Google");
        building.put(2, "Apple");
        building.put(3, "Microsoft");
        building.put(4, "IBM");
        building.put(5, "Syntax");

        System.out.println(building);
        building.put(5, "Amazon");
        System.out.println(building);
        System.out.println(building.get(2));

        System.out.println(building.size());
        building.replace(5, "Tesla");
        building.remove(5);
        System.out.println(building);


    }
}
