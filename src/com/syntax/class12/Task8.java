package com.syntax.grouptasks;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {10,9,12,20,0,225};
		int largest=array[0];
		int secondLargest=0;
		for(int i=1;i<array.length;i++) {
			if(array[i]>largest) {
				secondLargest=largest;
				largest=array[i];
			}else if(array[i]>secondLargest ) {
				secondLargest=array[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(secondLargest);

	}

}
