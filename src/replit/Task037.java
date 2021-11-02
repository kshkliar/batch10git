package replit;
import java.util.Scanner;
public class Task037 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*For you to do:

Take 2 boolean inputs from a user:
"Are you thirsty?"
"Are you sleepy?"
If user is thirsty and not sleepy--> drink=water
If user is thirsty and sleepy--> drink=coffee
If user is not thirsty and sleepy --> drink=tea
Otherwise drink="nothing"
Output:
Output:
Looks like you need to drink ___*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean isThirsty = scanner.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean isSleepy = scanner.nextBoolean();
		if (isThirsty && !isSleepy) {
			System.out.println("Looks like you need to drink water");
		} else if (isThirsty) {
			System.out.println("Looks like you need to drink coffee");
		} else if (isSleepy) {
			System.out.println("Looks like you need to drink tea");
		} else {
			System.out.println("Looks like you need to drink nothing");
}
	}

}
