package com.syntax.class09;

public class NestedRecap1 {


	public static void main(String[] args) {


		for (int i = 1; i <= 5; i++) {
			System.out.println("Loop i");
			for (int j = 1; j < 4; j++) {
				System.out.println("Loop j");
			}
		}

		System.out.println("--------Multiplication table-----------");


		for (int a = 1; a <= 10; a++) {
			for (int b = 1; b < 10; b++) {
				System.out.println(a + " X " + b + " = " + (a * b));
			}
			System.out.println("------------");
		}
		System.out.println("----------24 hours clock------------");

		for (int h = 0; h < 24; h++) {

			for (int m = 0; m < 60; m++) {
				if (h < 10 && m < 10) {
					System.out.println("0" + h + ":0" + m);
				} else if (h < 10 && m >= 10) {
					System.out.println(" 0 " + h + ":" + m);
				} else {
				}
				System.out.println(h + ":" + m);

			}
		}

		System.out.println("-------Blakes Code---------------");
		for (int a = 0; a <= 2; a++) {
			for (int c = 0; c < 10; c++) {
				if (a == 2 && c == 4) {
					break;
				}
				for (int d = 0; d < 6; d++) {
					for (int b = 0; b < 10; b++) {

						System.out.println(a + "" + c + ":" + d + "" + b);
					}
				}
			}

		}

		System.out.println("-----Serge's code--------");

		String min="", hour="";
		for (int h=0; h<=23;h++){
		for (int m=0;m<=59;m++){
			if (h<10) {
				hour = "0" + h;
			}else{
				hour=""+h;
			}

			if (m<10){
				min="0"+m;
			}else{
				min=""+m;
			}
			System.out.println(hour+ ":"+min);
			}
		}

		System.out.println("-------What is the Output----------");

		for (int i=0; i<=3;i++){
			System.out.println("Outer loop"+ i);
			for (int j=0;j<=3;j++){
				System.out.println("Inner loop "+ j);
				break;
			}
			System.out.println("-------");
		}

		System.out.println("-------What is the output----------");

		boolean boo= true;
		for (int i=1;i<3;i++){
			System.out.println("Outer for loop");
			while(boo){
				System.out.println("I am nested while loop");
				break;
			}
			System.out.println(" !!!  ");
		}



	}
}