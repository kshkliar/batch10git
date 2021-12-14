package com.collection.class28.arrraylista;

import java.util.ArrayList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");

        /*subjects.remove(0);
        subjects.remove("Git");*/
        System.out.println(subjects);
        subjects.removeIf(subject -> subject.length() > 4);
        //заменяет адхенсм фор луп
    }
}
