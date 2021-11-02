package com.collection.class29.arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.remove(new Integer(5));
        System.out.println(arrayList);
    }
}
