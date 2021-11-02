package com.syntax.class07;

public class ForLoopMoreExamples {

	public static void main(String[] args) {
		
		/*
		 *  I want to print multiplication table
		 *  
		 *  1X1=1;
		 *  1X2=2;
		 *  ....
		 *  1X10=10
		 */
		
		int num=9;
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(num+" X "+i+" = "+num*i);
		}
		
		System.out.println("What is the output?");
		
		int sum=0;
		
		for (int i=1; i<=5; i++) {
			
			sum=sum+i;
			
		}

		System.out.println(sum);
		
		System.out.println("What is the output?");
		
		sum=0;
		
		for (int i=0; i<=40; i+=10) {
			sum+=i;
		}
		
		System.out.println(sum);
		
	
		System.out.println("What is the output?");
		
		int total=1;
		
		for(int i=1; i<10; i++) {
			total=i;
			System.out.println(total);
		}
		
		
		
		/*
		 * HW task
		 * 
		 * Please find sum of even and odd numbers from 1 to 100
		 */
		
		/*
		 * /*Ask user to pay for a candy 
	 *keep asking user to pay for coffee until entered price is not equal to 3
	 *after user got a write amount print "Please enjoy your candy"*/

		 
	}
}
