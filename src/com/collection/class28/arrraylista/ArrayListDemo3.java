package com.collection.class28.arrraylista;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hilal");
        arrayList.add("Eli");
        arrayList.add("Jim");
        arrayList.add("Eli");
        arrayList.add("Tes");
        arrayList.add("Eli");

        System.out.println(arrayList);
        arrayList.remove("Eli");

        System.out.println(arrayList);

        arrayList.add(2, "Serge");

        System.out.println(arrayList);
    }
}
