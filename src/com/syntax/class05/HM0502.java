package com.syntax.class05;

import java.util.Scanner;

public class HM0502 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String month, season;
        System.out.println("Please enter your month of birthday");
        month = scan.next();
        season = "";

        if (month.equals("December") || month.equals("January") || month.equals("February")) {
            season = "Winter";
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            season = "Spring";
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            season = "Summer";
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            season = "Fall";

        }

        System.out.println("You were born in season " + season);
    }

}
