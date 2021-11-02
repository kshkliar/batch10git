package replit;

import java.util.Scanner;

public class Task039a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade. */
		
	int mark;
	Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your mark");
		mark=scan.nextInt();
		if (mark >= 1 && mark <= 25) {
			System.out.println("F");

		} else if (mark > 25 && mark < 45) {
			System.out.println("E");}
		else if (mark > 45 && mark < 50) {
			System.out.println("D");
		}else if (mark > 50 && mark < 60) {
			System.out.println("C");}
		else if (mark > 60 && mark < 80) {
			System.out.println("B");
		}else if ( mark > 80) {
			System.out.println("A");
		}else{

			System.out.println("Please enter valid mark");
		}
	}

}
