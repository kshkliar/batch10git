package com.collection.class28.arrraylista;

import java.util.ArrayList;

public class ArrayListDemo9 {

    public static void main(String[] args) {
        ArrayList<String> subject = new ArrayList<>();
        subject.add("SDLC");
        subject.add("Manual Testing");
        subject.add("Java");
        subject.add("Git");
        subject.add("Selenium");
        subject.add("TestNg");
        for (int i = subject.size(); i >= 0; i--) {
            System.out.println(subject);
        }
    }
}

