package replit;

import java.util.Scanner;

public class Task044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * For you to do:
		 * 
		 * Prompt user with questions: "Please enter your favorite car make"
		 * 
		 * if user enters BMW --> carOrigin = "german car" if user enters Toyota -->
		 * carOrigin = " japanese car" if user enters Maserati --> carOrigin =
		 * "italian car" anything else besides those values --> carOrigin = "unknown"
		 */

		System.out.println("Please enter your favorite car maker");
		Scanner scanner = new Scanner(System.in);
		String carModel=scanner.next();
		switch (carModel) {
		case "BMW":
			System.out.println("Your favorite car is german car");
			break;
		case"Toyota":
			System.out.println("Your favorite car is japanese car");
			break;
		case "Maserati":
			System.out.println("Your favorite car is italian car");
			break;
			default:
			System.out.println("Your favorite car is unknown");
			
		}
	}

}
