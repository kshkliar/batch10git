package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

    /*
     * Write a program to ask user to enter value for sale: yes or no
     * if there is no sale --> you are not going for shopping
     * if there is sale ask user for the item and price of the item
     * Based on the price you have to calculate the price of the item after the discount
     * if price is less than $20 --> apply 10%
     * if price is between $20 & $100 --> 20%
     * if price between $100 & $500 --> 30%
     * otherwise apply 50% discount
     *
     * After discount ___ the price of the item reduced from __ to
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sale;
        double price;
        int discount = 0;
        double finalPrice;
        System.out.println("Is there a sale now?");
        sale = scan.nextLine();

        if (sale.equals("yes")) {
            System.out.println("What you would like to purchase");
            String item = scan.nextLine();
            System.out.println("What the price for the item?");
            price = scan.nextDouble();

            if (price >= 1 && price < 20) {
                discount = 10;
            } else if (price >= 20 && price < 100) {
                discount = 20;
            } else if (price >= 100 && price < 500) {
                discount = 30;
            } else if (price > 500) {
                discount = 50;
            }
            finalPrice = price - (price * discount / 100);

            System.out.println("After discount " + discount + "% the price of the "
                    + item + " reduced from $" + price + " to " + finalPrice);
        }else{
            System.out.println("Sorry, no shopping today!");
        }
    }
}
