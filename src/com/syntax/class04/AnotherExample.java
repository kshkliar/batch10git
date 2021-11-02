package com.syntax.class04;

//shortcut to import: mac -> cmd+shift+o    windows --> ctrl+shift+o

import java.util.Scanner;

public class AnotherExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your city");
        String city = input.nextLine(); //capturing String value and we need to hit enter

        System.out.println("Please enter temperature in your city");
        double temp = input.nextDouble();//capturing double value and we need to hit enter

        System.out.println("It is " + temp + " in " + city);

    }
}
