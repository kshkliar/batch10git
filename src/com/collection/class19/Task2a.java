package com.collection.class19;

public class Task2a {
    /*
    Write a java program of Class Students that takes students
    name and 3 subject grades. Inside your class also have a
    method to Calculate Average Grade. Test Student class for 5
    different students with different marks. Your program should
    print an average mark of each students name.
     */
 String name;
 double subject1Marks;
 double subject2Marks;
 double subject3Marks;

    Task2a(String name, double subject1Marks, double subject2Marks, double subject3Marks) {
        this.name=name;
        this.subject1Marks=subject1Marks;
        this.subject2Marks=subject2Marks;
        this.subject3Marks=subject3Marks;
    }

    void printAver() {
        System.out.println("The average score is "+(subject1Marks+subject2Marks+subject3Marks)/3);
    }
}
