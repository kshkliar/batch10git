package com.collection.class28.arrraylist;

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
        for (String subject:subjects
             ) {
            if(subject.length()>4){
                subjects.remove(subject);
            }
        }
    }
}
