package com.collection.class29.seta;

import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits=new LinkedHashSet<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("apple");
        fruits.add("apple");
        System.out.println(fruits);
    }
}
