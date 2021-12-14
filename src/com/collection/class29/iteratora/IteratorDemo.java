package com.collection.class29.iteratora;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");

        Iterator<String>iterator=subject.iterator();
        System.out.println(iterator.hasNext());

        System.out.println(iterator.next());


        iterator.remove();

        System.out.println(subject);
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
    }
}
