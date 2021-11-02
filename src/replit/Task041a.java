package replit;

import java.util.Scanner;

public class Task041a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*For you to do:

Write a program using the switch statement

Let us consider the scenario regarding the born baby age

First Output: "Enter the age of the Child"
copied!
First Output: "Enter the age of the Child"
case 1: if age is 1 print as "You can Crawl"
case 1: if age is 1 print as "You can Crawl"
case 2 : if age is 2 print as  "You can Talk"
case 2 : if age is 2 print as  "You can Talk"
case 3: If age is 3 print as "You can Dance"
case 3: If age is 3 print as "You can Dance"
case 4: if age is 4 print as "You can get Trouble"
case 4: if age is 4 print as "You can get Trouble"
Other than this age (1-4) it should print "I don't know how old you are" */

	Scanner scan =new Scanner(System.in);
	int age;
		System.out.println("Please enter the age of Child");
		age=scan.nextInt();
		switch (age) {
			case 1:
				System.out.println("You can Crawl");
				break;
			case 2:
				System.out.println("You can Talk");
				break;
			case 3:
				System.out.println("You can dance");
				break;
			case 4:
				System.out.println("You can get Trouble");
				break;
			default:
				System.out.println("I do not know how old are you");
		}
	}

}
