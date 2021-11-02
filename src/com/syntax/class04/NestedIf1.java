package com.syntax.class04;

public class NestedIf1 {

    public static void main(String[] args) {

        boolean vaccine = true;
        boolean secondDose = true;

        if (vaccine) {//yes
            System.out.println("Let's check how many doses you got");
            if (secondDose) {
                System.out.println("You are fully vaccinated");
            } else {
                System.out.println("You will need to get a 2nd dose. ");

            }
            System.out.println("End of outer if block");

            System.out.println(" ----     ANOTHER EXAMPLE OF NESTED IF -----------    ");

            /*
             * Every friday is movie day if it is the 13th --> you want to watch a scary
             * movie
             */
            int day = 13;
            boolean isFriday = true;
            if (isFriday) {
                System.out.println("I am going to watch movie");
            }
            if (day == 13) {
                System.out.println("Yay, I am watching scary movie");
            } else {
                System.out.println("I am watching whatever is popular");
            }

        } else {
            System.out.println("I am going to study");
        }
    }
}

/*
* "End of outer if block"
*
* */
