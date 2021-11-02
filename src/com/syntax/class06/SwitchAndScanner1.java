package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner1 {

    public static void main(String[] args) {

        /*
         * I want to ask where you are from?
         * based on the country we will define traditional?
         */

        Scanner scan;
        String country, traditionalFood;

        scan = new Scanner(System.in);
        System.out.println("Where are you from?");
        country = scan.nextLine();
        switch (country) {
            case " USA":
                traditionalFood = "byrger";
                break;
            case "Afganistan":
                traditionalFood = "gabeli palaw";
                break;
            case "Peru":
                traditionalFood = "cevice";
                break;
            case "Italy":
                traditionalFood = "pasta";
                break;
            case "Tadzikistan":
                traditionalFood = "kuruto";
                break;
            case "Ukraine":
                traditionalFood = "borsch";
                break;
            case "Kazakhstan":
                traditionalFood = "bashbarmak";
                break;
            case "Turkey":
                traditionalFood = "borek";
                break;
            default:
                traditionalFood = "unknown";
        }
        System.out.println("You are from " + country + " and your traditional food is " +
                traditionalFood);
    }
}