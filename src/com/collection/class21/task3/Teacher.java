package com.collection.class21.task3;

public class Teacher {
    /*
    Write a Java program called Teacher.
      Identify features and behaviour of that Class.
       Create 3 subclasses MathTeacher,
       ChemistryTeacher and PianoTeacher that would
       have it their own features and behaviour.
       Test all 4 classes
     */
    static String school="Syntax";
    String name;
    int age;
    String books;
    double salary;
    void teach(){
        System.out.println(name+" teaches "+books);
    }
}
