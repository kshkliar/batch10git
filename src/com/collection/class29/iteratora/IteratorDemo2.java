package com.collection.class29.iteratora;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");


        Iterator<String>iterator=subjects.iterator();
        System.out.println();

        while (iterator.hasNext()) {

            String subject=iterator.next();
            if (subject.length() > 4) {
                iterator.remove();
            }
        }
        System.out.println(subjects);
    }
}