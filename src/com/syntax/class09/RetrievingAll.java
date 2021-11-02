package com.syntax.class09;

public class RetrievingAll {

	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		
		int size = grades.length; // gives the size -> how many elements in that array
		System.out.println(size);

		System.out.println(grades[1]);

		int i = 0;
		System.out.println(grades[i]);

		i++;
		System.out.println(grades[i]);
		
		System.out.println(" ----  RETRIEVING ALL VALUES USING FOR LOOP ------ ");

		for (int j = 0; j < size; j++) {
			
			System.out.println(grades[j]);
		}
		
		
		System.out.println(" ---------------------------------------------------  ");
		
		String[] names= {"Jose", "Sule", "Blake", "Enes", "Ana", "Andrei", "Burju", "Imam"};
		
		for(int a=0; a<names.length; a++ ) {
			
			System.out.println(names[a]);
		}
		
	}
}
