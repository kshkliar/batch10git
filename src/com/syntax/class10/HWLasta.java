package com.syntax.class10;

public class HWLasta {

	public static void main(String[] args) {
		
		/*
		 * From an array of integer elements find the largest number.
		 */

		int[] num = {10, 20, 101, 50, 22};

		int largest=num[0]; // задаем условно что ларжест хранится в этой ячейке
		for (int i = 1; i < num.length; i++) {//проходимся по ячейкам
			if (num[i] > largest) {// если какой то из индексов которыми мы проходимся по
				// очереди больше предыдущего , то мы его кладем в переменную largest
				largest=num[i];
			}
		}


		System.out.println(largest);//выводим переменну в которой хранится наибольшее значение
		System.out.println(" ------------------------------------------  ");

		largest=num[0];
		for(int n:num){
			if (n>largest){
				largest=n;
			}
		}

		System.out.println(largest);

	}
}
