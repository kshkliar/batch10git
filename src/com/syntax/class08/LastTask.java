package com.syntax.class08;

import java.util.Scanner;

public class LastTask {

	public static void main(String[] args) {
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money, accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change. Whenever a user done with payments program should say
		 * "Thank you for shopping!"
		 */
		
		Scanner scan;
		String item;
		double price, money, total=0, change;
		
		scan=new Scanner(System.in);
		System.out.println("What item do you want to buy?");
		item = scan.nextLine();
		
		System.out.println("Whats the price of the item?");
		price = scan.nextDouble();
		
		System.out.println("Please pay for the item");
		
		do {
			money=scan.nextDouble();
			total+=money;
			
			if (total>price) {
				change=total-price;
				System.out.println("Here is your change "+change);
				break;
				
			} else if (total<price) {
				System.out.println("Please give more "+(price-total));
			} else {
				System.out.println("That is the exact amount");
			}
			
		}while(total!=price);
		
		System.out.println("Thank you for shopping");
	}
}
