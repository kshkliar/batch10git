package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

    public static void main(String[] args) {

        Scanner scan;
        int quiz, midterm, overall, average;
        char grade;

        scan = new Scanner(System.in);
        System.out.println("Enter quize score");
        quiz = scan.nextInt();
        System.out.println("Enter midterm score");
        midterm = scan.nextInt();
        System.out.println("Enter final score");
        overall = scan.nextInt();

        average = (quiz + midterm + overall) / 3;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 70 && average < 90) {
            grade = 'B';
        } else if (average >= 50 && average < 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("With average score =" + average + " your grade is " + grade);
    }
}