package com.syntax.class05;

public class LogicalOr1 {
	
	public static void main(String[] args) {
		
		/*
		 *  define a day
		 *  if day is Monday or Friday -> No class
		 *  if day is Tuesday or Wednesday -> Manual Class
		 *  if day is Thursday -> Review Class
		 */

		String day="Sunday";
				if (day.equals("Monday")|| day.equals("Friday")){
					System.out.println("No class");
				}else if (day.equals("Tuesday")||day.equals("Wednesday")){
					System.out.println("Manual class");
				}else if(day.equals("Thursday")){
					System.out.println("Review Class");
				}else{
					System.out.println("Today is weekend day");
				}






		
	}
}
