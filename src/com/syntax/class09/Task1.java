package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {

		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B
		 */
		
		/*
		 * Create an array of syntaxfc and store all syntaxfc from your group. 
		 * Then print your name from that array. 
		 */


		String []syntaxfc=new String[8];

		syntaxfc[0]="Jose";
		syntaxfc[1]="Sule";
		syntaxfc[2]="Blake";
		syntaxfc[3]="Anna";
		syntaxfc[4]="Enes";
		syntaxfc[5]="Andrei";
		syntaxfc[6]="Burju";
		syntaxfc[7]="Gurkan";
		System.out.println(syntaxfc[0]);
		int size=syntaxfc.length;
		System.out.println("# of elements in array syntaxfc= "+  size);

// declaration and storing values must be completed right away
String [] names={"Jose", "Sule", "Blake", "Enes", "Ana", "Andrei", "Burju"};
		System.out.println(names[6]);
		System.out.println(names.length);

names[6]="Francisco";
		//System.out.println(names[8]);ArrayIndexOutOfBoundsException
		
int []num;
num=new int [2];
num[0]=1;
num[1]=10;

int []n;
// not possible to add values this way after declaration
int [] array={10, 20, 30, 40, 50};
		//n= {10, 20};  not possible to add values this way after declaration
		

		
		//TASK
		/*
		 * Create an array of words: Java, Saturday, day, coding, is.
		 * Print the following sentence using elements of array: “Saturday is Java coding day”. 
		 */
		
	}
}
