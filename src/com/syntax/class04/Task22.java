package com.syntax.class04;

public class Task22 {

    /*
     * Create a Java program and store values of mortgage rate and mortgage price.
     * First, program should check if rate is higher than 4.5 user will not buy a
     * house, otherwise user will consider buying. Once user decides to buy a house,
     * if price of the house is larger than 200000 than user will take a loan,
     * otherwise user will pay cash.
     */

    public static void main(String[] args) {
        double rate = 4.5;
        double price = 100000;
		if (rate>4.5){
            System.out.println("I wont buy a house with rate of "+ rate);
    }else{
            System.out.println("I will consider buing ");

           if (price>200000){
               System.out.println("I will take a loan to buy a house of price "+ price);
           }else{
               System.out.println("I will pay cash for the house costing "+ price);
           }
        }
        System.out.println("-----------SAME TASK-------------");

}
}
