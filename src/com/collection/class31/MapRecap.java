package com.collection.class31;


import java.util.*;

public class MapRecap {

    //Key and Value   / / It is not a collection

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();//implimentation class -HashMap
        //Integer, String - Key , value

        map.put(101, "Oxana");
        System.out.println(map.size());
        System.out.println(map);
        //it is not allowed duplicate key
        //if we put duplicate key it will override the value
        //Map allows null key
        map.isEmpty();
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(102, "Konstantin");
        map2.put(102, "Konstantin");
        map2.put(103, "Konstantin");
        map2.put(104, "null");
        map2.put(105, "Olena");
        //
        Map<Integer, String> map3 = new TreeMap<>();
        map3.put(102, "Konstantin");
        map3.put(102, "Konstantin");
        map3.put(103, "Konstantin");
        //   map3.put(null,"Olena");// does not allow null value;
        map3.put(105, "Olena"); //it creates order

        Map<Integer, String> map4 = new Hashtable<>();
        map4.put(101, "Jemil");
        map4.put(102, "Konstantin");
        //       map4.put(null,"Me"); // do not preserve order  does not allow null keys

        // Thread save or not Thread save there are differante classes
        System.out.println(map4.get(101));// acess 1 value by specifying keys
        // t access all keys and values ( keys is also objects
        //When we want to get collection of key (101, 102, 103 )or values ( Oxana, Joe, Miche)

        Collection<String> val = map.values();// здесь мы конвертировали мап в Collection
        //How to get values from collection?
        //we can use loop or iterator
        for (String str : val) {
            System.out.println(str);// we are able to get all values ( before we convert map to collection

            // or we can use iterator also to retrieve the values

            System.out.println("Getting all keys");
            Set<Integer> keys = map.keySet();
            for (Integer key : keys) {
                System.out.println(key + map.get(keys));
                Iterator<Integer> iter = keys.iterator();
                while (iter.hasNext()) {// if we have next element we move
                    Integer i = iter.next();// return Integer object
                    System.out.println(i + " " + map.get(i));
                }
            }
        }
        //Когда хотим поместить мап в сет мы помещаем кие анд валью в сет
        //Key and value is inside Set: ( with help of Entry Interface inner interface of Map
        //entry set give you collection of entry objects
        Set<Map.Entry<Integer, String>> setEntr = map.entrySet();
//у меня почему то ЕНтри сразу с мап
        for (Map.Entry<Integer, String> entry : setEntr) {
            //Entry is a combination of key and value it is a obkect but it contains two objects
            //key and value
            //every object that we strore inside collection we call element
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Iterator<Map.Entry<Integer, String>> it3 = setEntr.iterator();
        while (it3.hasNext()) {
            Map.Entry<Integer, String> e = it3.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
// with help of Entry we can take pair key and value and can put inside the set
    //not separetle key and value like we did it before;
    // when we will store data in database or exel we will use keys and tabels ,
    // so it is very usefull

    // for interview you need to know how to work with map and how to work with collection

    //student can ve intire class , so to practice store the class student with key(101, 102,)
    // inside the map
}
