package com.syntax.class06;

import java.util.Scanner;

public class SwitchAndScanner {
	
	public static void main(String[] args) {
		
		/*
		 * I want to ask where you are from?
		 * based on the country we will define traditional?
		 */
		
		Scanner in;
		String country, tradionalFood;
		
		in=new Scanner(System.in);
		System.out.println("Hey, where are you from?");
		country=in.nextLine();
		
		switch(country) {
		
		case "USA":
			tradionalFood="burger";
			break;
		case "Afghanistan":
			tradionalFood="qabeli palaw";
			break;
		case "Peru":
			tradionalFood="cevice";
			break;
		case "Italy":
			tradionalFood="pasta";
			break;	
		case "Tajikistan":
			tradionalFood="kuruto";
			break;
		case "Ukraine":
			tradionalFood="borsch";
			break;
		case "Kazakhstan":
			tradionalFood="beshbarmak";
			break;
		case "Turkey":
			tradionalFood="borek";
			break;
		default:
			tradionalFood="unknown";
		}
		
		System.out.println("You are from "+country+" and your traditional food is "+
				tradionalFood);
		
	}
}
