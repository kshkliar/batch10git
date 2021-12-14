package com.collection.class28.arrraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//инхеритенс аррайлист это чайл листа
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
        list.addAll(list1);//обьеденили 2 листа
        System.out.println(list);// и вывели в консоль

        list.addAll(1,list1); //обьеденил индекс и лист можно и листы обьеденить

        //  System.out.println(list.size());//дает размер листа
        System.out.println(list);
        /*list.add(1,list1.get(0));
        System.out.println(list);*/



    }
}
