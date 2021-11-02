package com.collection.class28.arrraylist;

import java.util.ArrayList;

public class ArrayListDemo9 {

    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");
        for (int i = subjects.size(); i >=0; i--) {
            if(subjects.get(i).length()>4){
                subjects.remove(i);
            }
        }
        System.out.println(subjects);
    }
}
