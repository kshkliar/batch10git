package com.collection.class29.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Night");
        words.add("Day");
        words.add("Sun");
        words.add("Mom");
        for (String s : Arrays.asList("Lion", "Moon")) {
            System.out.println(words.contains(s));
        }
        System.out.println(words);
        ArrayList<String> otherWords = new ArrayList<>();;
        otherWords.add("Sun");
        otherWords.add("Moon");
        System.out.println(words.contains(otherWords));
    }
}
