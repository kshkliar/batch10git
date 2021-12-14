package com.collection.class28.arrraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hilal");
        arrayList.add("Eli");
        arrayList.add("Jam");
        arrayList.add("Eli");
        arrayList.add("Tes");
        arrayList.add("Eli");

        System.out.println(arrayList);
        arrayList.remove("Eli");// удалили один елемент с аррайлиста

        System.out.println(arrayList);

        arrayList.add(2, "Serge");// вставили сергея в индекс № 2- перегруженный метод адд( с параметрами)

        System.out.println(arrayList);

    }
}
