package replit;

import java.util.Scanner;

public class Task038a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*For you to do:

Prompt user with a question: "Is it weekend?"

If it is not a weekend --> subject="manual testing"

Otherwise --> subject="Java"*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean weekend=scan.nextBoolean();
		if (!weekend) {
			System.out.println("subject=manual testing");
		}else{
			System.out.println("subject=Java");
		}
	}

}
