package com.syntax.class04;
import java.util.Scanner;
public class BooleanScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        
	           System.out.print("Are you above 18?- ");  
	           Scanner sc = new Scanner(System.in);  
	           boolean bn = sc.nextBoolean();  
	           if (bn == true) {  
	               System.out.println("You are over 18");  
	           } else if (bn == false) {  
	               System.out.println("You are under 18");  
	}

}
}