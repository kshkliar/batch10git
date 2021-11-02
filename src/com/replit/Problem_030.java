/*
Write a program to take the month number from a user.
Provide month name to the corresponding month number
If a user provides any number that is out of month range, the program should display "Invalid"
IMPORTANT: use Scanner Class
Example Output:
Please enter month number 1
January
Please enter month number 33
Invalid
 */
package com.replit;
import java.util.Scanner;

public class Problem_030 {
	public static void main(String[]args){
		  Scanner month=new Scanner(System.in);
		  System.out.println("please enter month number");
		  int monthNumber=month.nextInt();
		  if (monthNumber==1){
		    System.out.println("January");
		  }else if(monthNumber==2){
		    System.out.println("February");
		  }else if(monthNumber==3){
		    System.out.println("March");
		 } else if (monthNumber == 4) {
		            System.out.println("April");
		        } else if (monthNumber == 5) {
		            System.out.println("May");
		        } else if (monthNumber == 6) {
		            System.out.println("June");
		        } else if (monthNumber == 7) {
		            System.out.println("July");
		        } else if (monthNumber == 8) {
		            System.out.println("August");
		        } else if (monthNumber == 9) {
		            System.out.println("September");
		        } else if (monthNumber == 10) {
		            System.out.println("October");
		        } else if (monthNumber == 11) {
		            System.out.println("November");
		        } else if (monthNumber == 12) {
		            System.out.println("December");
		        }else{
		          System.out.println("Invalid");
    }
}
}