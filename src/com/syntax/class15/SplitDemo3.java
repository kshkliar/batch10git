package com.syntax.class15;

public class SplitDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "?This is Batch 10? Batch 10 is great? How are you";
		
		
		
		
		String[] strArr=str.split("[?]");//создали массив стрингов
		System.out.println(strArr.length);//определили длину
		
		
		System.out.println(strArr[3]);// вывели индекс 3
	}

}
