package com.collection.class29.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");

        Iterator<String> iterator=subjects.iterator();
        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());
        //t iavoid issues with loop we use iteratir method
    ///    Itetator is a interface that it has next has next and remove methoa
        iterator.remove();

        System.out.println(subjects);
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());


    }
}
