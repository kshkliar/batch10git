package com.syntax.class15;

public class SplitDemo3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "?This is Batch 10? Batch 10 is great? How are you";
		
		
		
		
		String[]strArr=str.split("[?]");
		System.out.println(strArr.length);

		System.out.println(strArr[3]);
	}

}
