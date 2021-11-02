package com.collection.class28.arrraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Abdul");

        System.out.println(list.size());
        ArrayList<String> list1=new ArrayList<>();
        list1.add("Mars");
        list1.add("Eugene");
        list1.add("Dilnoza");

        System.out.println(list);
        list.addAll(1,list1);
        System.out.println(list.size());
        System.out.println(list);
        /*list.add(1,list1.get(0));
        System.out.println(list);*/



    }
}
