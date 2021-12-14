package com.collection.class28.arrraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        int[] arr2 = new int[20];
        arr2[2] = 1452;
        //мы сохраняем в угловые скобки стринг это генерики <String>  во время рантайма оно меняет дата тайп
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hilal");//that is how we add values to arraylist
        arrayList.add("Eli");
        arrayList.add("Jam");
        arrayList.add("Tes");
        //arrayList.add(50);  пытаемся сохранить интижер вместо стринга о котором заявили
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));//берем значения инкса 2

        arrayList.set(2, "1000");//назначаем значение индекса а потом значение индекса через запятую
        //E -дженерик его можно увидеть в документации Е меняет тип во времч рантайма
        System.out.println(arrayList.get(2));
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);


    }
}
