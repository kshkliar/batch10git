package com.syntax.class08;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            System.out.println("I am i loop ");

            for (int j = 0; j <= 3; j++) {
                System.out.println("I am j loop ");
            }

            System.out.println(" -------- ");
        }

        System.out.println(" ------------------ ");

        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j <= 9; j++) {

                System.out.println(i + " " + j);
            }
        }

    }
}
