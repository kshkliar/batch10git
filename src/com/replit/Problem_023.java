/*
Create a program that will ask a user to input boolean value "Input the boolean value"
If the input is true or false, then the output should look like below:
Example Output:
Input the boolean value
The value is true
Example Output:
Input the boolean value
The value is false
 */
package com.replit;
import java.util.Scanner;

public class Problem_023 {
	  public static void main(String[] args) {
		  Scanner userInput=new Scanner(System.in);
		  System.out.println("Input the boolean value");
		  boolean value1=userInput.nextBoolean();
		  if (value1){
		    System.out.println(" The value is " +value1);
		  }else{
		    System.out.println(" The value is " +value1);
        }
    }
}
