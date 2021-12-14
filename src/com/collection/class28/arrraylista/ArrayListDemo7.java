package com.collection.class28.arrraylista;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Andrei");
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Jam");
        list.add("Abdul");
        list.add("Andrei");


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Michael");
        list.add("Abdul");
        list1.add("Andrei");

        list.removeAll(list1);// udalili chast lista s pervogo lista
        System.out.println(list);
       // System.out.println(list1);
    }
}
