package com.syntax.class15;

public class SplitDemo2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str="This is Batch 10. Batch 10 is great";
		String []strArr=str.split("[.]");

		for (String string : strArr) {
			System.out.println(string);
		}



	}

}
