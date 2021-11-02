package com.collection.class29.arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        int [][] numbers=new int[10][10];
        ArrayList<ArrayList<String>> arrayList=new ArrayList<>();

        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Hello");

        arrayList.add(arrayList1);

    }
}
