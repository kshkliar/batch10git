package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {

		int day = 8;
		String dayName;

		// if statement is condition (true/false) based statement
		//if else if is like a ladder
		if (day == 1) {
			dayName = "Monday";
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sanday");
		} else {
			System.out.println(day + " is invalid day number. Please use day from 1-7");
		}

		System.out.println("---  USING SWITCH STATEMENT ------");

		//switch is a value based statement. If find matching value case and jumps right away
		//switch is like an elevator
		
		/*
		 * in switch always remember:
		 * 
		 * Always use break; --> to stop and get out from switch block
		 * variable type and case values MUST be of same dataType
		 * 
		 * default: --> is optional
		 */
		
		switch (day) {

		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "Invalid";
			break;
		}
		System.out.println("Today is " + dayName);
	}
}
