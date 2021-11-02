package com.collection.class29.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        HashSet<String> letters=new HashSet<>();
        letters.add("Z");
        letters.add("B");
        letters.add("A");
        letters.add("D");
        letters.add("D");
        letters.add(null);
        System.out.println(letters);
    }
}
