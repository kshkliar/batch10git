package replit;

import java.util.Scanner;

public class Task036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*For you to do:

Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"

and make the comparisons:

if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"*/


		Scanner scanner =new Scanner (System.in);
		System.out.println("Please enter two strings");
		String string1=scanner.next();
		String string2=scanner.next();
		System.out.println("Please enter two numbers");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		if (string1.equals(string2)&&number1==number2) {
			System.out.println("AND");
		}else if (string1.equals(string2)|| number1 ==number2) {
			System.out.println("OR");
		}else {
			System.out.println("NONE");
			
		}
	}

}
