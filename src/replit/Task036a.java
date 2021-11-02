package replit;

import java.util.Scanner;

public class Task036a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*For you to do:

Prompt user to input two strings : "Please enter two strings"and two integers:
"Please enter two numbers"

and make the comparisons:

if int1 and int2 are equal and word1 and word2 are equal, output "AND"
if int1 and int2 are equal or word1 and word2 are equal, output "OR"
if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"*/

String string1;
String string2;
int num1;
int num2;

	Scanner scan =new Scanner(System.in);
		System.out.println("Plese enter two strings" );
		string1=scan.next();
		string2=scan.next();
		System.out.println("Please enter two numbers");
		num1= scan.nextInt();
		num2=scan.nextInt();
		if(string1.equals(string2)&&num1==num2) {
			System.out.println("AND");
		}else if (string1.equals(string2)||num1==num2) {
			System.out.println("OR");
			}else{
			System.out.println("NONE");
		}

			
		}
	}


