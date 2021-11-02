package replit;

import java.util.Scanner;

public class Task045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*For you to do:
Ask the user to enter any number from 1-7.
Based on the number define the day of the week
Example Output:
Input a number between 1-7
Input a number between 1-7
Friday
Friday
Example Output:
Input a number between 1-7
Input a number between 1-7
Invalid*/
	System.out.println("Enter any number between 1-7");
	Scanner scanner= new Scanner(System.in);
	int number =scanner.nextInt();
	switch (number) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("Saturday");
		break;
	case 7:
		System.out.println("Sunday");
		break;
		default:
			System.out.println("Invalid");
	}
	}

}
