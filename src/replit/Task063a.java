package replit;

import java.util.Scanner;

public class Task063a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Given the following inputs:
		int x;
		Write a for loop that will print out a series of numbers starting at 0
		and ending at the x(value must be taken from user),
		exclusive.*/
	
		Scanner inp= new Scanner (System.in);
		System.out.println("In:");
		int x=inp.nextInt();
		//write code under on step 8
		for (int i = 0; i <= x; i++) {
			System.out.println(i);
		}



	}

}
