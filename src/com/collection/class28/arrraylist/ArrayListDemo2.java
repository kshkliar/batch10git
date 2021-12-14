package com.collection.class28.arrraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<>();//мы хотим сохранить обьекты в аарейлист разные типы данных
        arrayList.add(10);//например интиджер  и мы не указываем размер аррейлиста как в массиве
        arrayList.add("jam");//или стринг  любые типы даныех если аррейлист типа обьекта

        ArrayList arrayList1=new ArrayList();// тоже самое что и в 7 строке создали обьект типа аррейлист
        arrayList1.add(10);
        arrayList1.add("sdmfbks");
 // так нельзя делать потому что это может вызвать ран тайм ерор указывай тип данных
    }
}
