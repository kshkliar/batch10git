package com.syntax.class15;

public class Task2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom�s
		 * first name? Mary Dad�s first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY Example Output: Mom�s first name? Mary Dad�s first name? Daniel
		 * Boy or Girl? girl Suggested baby name: MAIEL
		 *
		 */

		String dadsNAme="Ali";
		String momsName="Maria";
		String expectation="girl";

		if (expectation.equalsIgnoreCase("boy")) {
			String firstHalf=dadsNAme.substring(0,dadsNAme.length()/2);
			String secondHalf=momsName.substring(momsName.length()/2);
			System.out.println(firstHalf+secondHalf);
		}else{
			String firstHaqlf = momsName.substring(0, momsName.length() / 2);
			String secondHalf=dadsNAme.substring(dadsNAme.length()/2);
			System.out.println(firstHaqlf+secondHalf);
		}




		
		
	}

}
