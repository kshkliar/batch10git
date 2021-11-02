package com.syntax.class10;

public class Task2DArrays {

	public static void main(String[] args) {
		
		String[][] arrName = {
				
		        {"Mr", "Mrs", "Ms", "Miss"},
		        
		        {"Smith", "Jordan", "Jackson", "Obama"}
		};
		
		
		for(String[] arr:arrName) {
			for(String a:arr) {
				System.out.print(a +" ");
			}
			System.out.println();
		}
		
		
		System.out.println("     ----------------------------------------   ");
		//how to access all elements
		
		for(int r=0; r<arrName.length; r++) { //outer loop iterates over rows
			for (int c=0; c<arrName[r].length; c++ ) { // inner loop iterates over columns
				System.out.print(arrName[r][c]+" ");
			}
			System.out.println();
		}

	}
}
