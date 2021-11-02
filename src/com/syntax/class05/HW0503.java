package com.syntax.class05;
import java.util.Scanner;
public class HW0503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		 
		  System.out.println("Please enter three distinct numbers");
		  int n1=scan.nextInt();
		   int n2=scan.nextInt();
	       int n3=scan.nextInt();
	       
	       if(n1>n2)
	       if(n1>n3) {
	    	   System.out.println("The largest number is" + n1);
	       }
	       if(n1>n2)
		   if(n2>n1) {
		    	   System.out.println("The largest number is "+ n2);
	}
	       if(n3>n2)
		    if(n3>n1) {
		    	   System.out.println("The largest number is "+ n3);
}
}
}