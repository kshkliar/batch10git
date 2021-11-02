package com.syntax.class04;
import java.util.Scanner;
public class HMTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner temp=new Scanner(System.in);
		
		System.out.println("Please enter your city ");
		Scanner scan= new Scanner(System.in);
		String city=scan.nextLine();
		System.out.println("Please enter the current temperature");
		int tempf =scan.nextInt();
		int tempc=(tempf-32)*5/9;
		System.out.println("The temperature in the city of " +city+ " is " +tempc+ " Celsius");
		
		
		
	}

}
