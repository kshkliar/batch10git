package com.collection.class29.seta;

import java.util.HashSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        HashSet<String> letters = new HashSet<>();
        letters.add("Z");
        letters.add("Z");
        letters.add("B");
        letters.add("A");
        letters.add("D");
        letters.add("D");
        letters.add(null);
        System.out.println(letters);
    }
}
