package com.collection.class28.arrraylist;

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
        System.out.println(list.remove("Andrei"));//удалила только одного андрея
//true means the task is done
        ArrayList<String> name = new ArrayList<>();
        name.add("Andrei");//мы создали еще один лист туда поместили андреев и потом удалили этот лист из листа
        list.removeAll(name);
        /*while (list.remove("Andrei")){//удалили вспех андреев
     //recommended if you want to remove all the entries
        }*/
        /*for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals("Andrei")){
                list.remove(i);
            }
        }*/

        //  System.out.println(list.remove("Obama"));

        System.out.println(list);
    }
}
