package com.collection.class29.arraylistdemo;

import java.util.ArrayList;

public class FlowerTester {
    public static void main(String[] args) {

        Flower[] flowers1 = {new Rose("Rose", "Pink"),
                new Tulip("Tulip", "Red")};

        ArrayList<Flower> flowers = new ArrayList<>();

        flowers.add(new Rose("Rose", "Pink"));
        flowers.add(new Tulip("Tulip", "Red"));
        flowers.add(new Sunflower("Sunflower", "Yellow"));

        for (Flower flower : flowers
        ) {
            flower.bloom();

        }
    }
}
