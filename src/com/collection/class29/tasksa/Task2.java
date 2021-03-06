package com.collection.class29.tasksa;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    /*
    Create an arrayList of words. Remove every word that ends with āeā.

// Break till 1:15
     */
    public static void main(String[] args) {


        ArrayList<String> words = new ArrayList<>();
        words.add("10");
        words.add("nine");
        words.add("great");
        words.add("like");
        words.add("hike");
        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.endsWith("e") || word.endsWith("E")) {
                iterator.remove();
            }
        }
        System.out.println(words);

    }
}
