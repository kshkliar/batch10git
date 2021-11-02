package replit;

import java.util.Scanner;

public class Task038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*For you to do:

Prompt user with a question: "Is it weekend?"

If it is not a weekend --> subject="manual testing"

Otherwise --> subject="Java"*/
		
		Scanner scanner =new Scanner (System.in);
		
		System.out.println(" Is it weekend?");
		boolean isWeekend=scanner.nextBoolean();
		if (!isWeekend) {
			System.out.println("Today you will be learning manual testing");
		}else {
			System.out.println(" Today you will be learning Java");
		}
	}

}
