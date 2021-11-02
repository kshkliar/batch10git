package com.collection.class28.tasks;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
         */
        ArrayList<String> name=new ArrayList<>();
        name.add("Mars");
        name.add("Andrei");
        name.add("Hilal");
        name.add("Abdul");
        name.add("Oxana");

        System.out.println(name.isEmpty());
        System.out.println(name.contains("Sule"));
        System.out.println(name.contains("Abdul"));
        System.out.println(name.size());
        System.out.println(name);
    }
}
