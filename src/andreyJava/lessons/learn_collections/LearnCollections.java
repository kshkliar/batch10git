package andreyJava.lessons.learn_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LearnCollections {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(8);
        list.add(10);

//        System.out.println(list);
/*
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        /*for (Integer integer : list) {
            System.out.println(integer);
        }*/

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();

            System.out.println(element);
        }

        Admin ben = new Admin(20, "Ben");
        Admin jack = new Admin(30, "Jack");

        List<Admin> admins = new ArrayList<>();

        admins.add(ben);
        admins.add(jack);
    }
}

class Admin {
    private int age;
    private String name;

    public Admin(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
