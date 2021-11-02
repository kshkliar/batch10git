package com.collection.class29.arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Night");
        words.add("Day");
        words.add("Sun");
        words.add("Moon");
        System.out.println(words.contains("Lion"));
        System.out.println(words.contains("Moon"));
       // words.clear();
        System.out.println(words);
        ArrayList<String> otherWords=new ArrayList<>();
        otherWords.add("Sun");
        otherWords.add("Moon");
        System.out.println(words.containsAll(otherWords));
    }
}
