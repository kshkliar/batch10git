package com.syntax.class10;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create an array of countries.
		/*While retrieving all values from an array print 
		 * capital for each country.(use 2 different loops
		 */
		  final int SIZE = 2;
	        Scanner in = new Scanner(System.in);
	        String countries[] = new String[SIZE];
	        String capitals[] = new String[SIZE];
	        System.out.println("Enter " + SIZE 
	            + " countries and their capitals");
	        
	        for (int i = 0; i < SIZE; i++) {
	            System.out.print("Enter country name: ");
	            countries[i] = in.nextLine();
	            System.out.print("Enter its capital: ");
	            capitals[i] = in.nextLine();
	        }
	        
	        System.out.println("Country Names\t\tCapital");
	        for (int i = 0; i < SIZE; i++) {
	            char ch = Character.toUpperCase(countries[i].charAt(0));
	            if (ch == 'A' ||
	                ch == 'E' ||
	                ch == 'I' ||
	                ch == 'O' ||
	                ch == 'U') {
	                System.out.println(countries[i] + "\t\t" + capitals[i]); 
	                
	                
	                
	                /*Which of these is an incorrect array declaration?
a) int arr[] = new int[5];
b) int [] arr = new int[5];
c) int arr[] = new int[5];
d) int arr[] = int [5] new;*/
	            }
	        }
	        
	    }
	}
