package com.collection.class29.seta;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("apple");
        System.out.println(fruits);
    }
}
