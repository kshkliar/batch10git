package com.syntax.class09;

public class AdvancedForLoop {

    public static void main(String[] args) {

        /*
         * TASK:
         * Create an array of cars and store 6 elements into it.
         * Print all values from the array.
         */

        System.out.println("  --------  CARS ARRAY ------------------");

        String[] cars = {"Corolla", "Tesla", "Checy", "Honda",
                "Mitsubishi", "Xpeng", "Nio", "Kia"};

        for (int a = 0; a < cars.length; a++) {

            System.out.println(cars[a]);
        }

        System.out.println(" ----   advance for loop / ehnaced for loop / for each loop  ----- ");

        for (String car : cars) {

            System.out.println(car);

        }

        System.out.println("  --------  NUMBERS ARRAY ------------------");

        int[] numbers = {100, 20, 67, 45, 90, 23};

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);

        }

        System.out.println(" ----   advance for loop / ehnaced for loop / for each loop  ----- ");

        for (int num : numbers) {

            System.out.println(num);
        }

        System.out.println("  --------  CHAR ARRAY ------------------");

        char[] grades = {'A', 'B', 'C', 'D', 'E'};

        for (char grade : grades) {

            System.out.print(grade + " ");
        }

        System.out.println(" I want to print values backwards !!!!");

        for (int i = grades.length - 1; i >= 0; i--) {

            System.out.print(grades[i] + " ");
        }
    }
}
