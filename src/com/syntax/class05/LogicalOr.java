package com.syntax.class05;

public class LogicalOr {
	
	public static void main(String[] args) {
		
		/*
		 *  define a day
		 *  if day is Monday or Friday -> No class
		 *  if day is Tuesday or Wednesday -> Manual Class
		 *  if day is Thursday -> Review Class
		 */

		String day="Tuesdayy";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("WE have no clas at Syntax");
		
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today is manual class");
		
		} else if (day.equals("Thursday")) {
			System.out.println("Today is our review class");
		
		} else if (day.equals("Saturday") || day.equals("Sunday")){
			System.out.println("Today is my favorite Java Class");
		
		} else {
			System.out.println("Please specify valid day");
		}
		
	}
}
