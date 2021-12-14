package com.collection.class28.arrraylista;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Andrei");
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Abdul");
        list.add("Andrei");
        System.out.println(list);
        System.out.println(list.remove("Andrei"));
        ArrayList<String> name = new ArrayList<>();
        name.add("Andrei");
        list.removeAll(name);


        System.out.println(list);
    }
}
