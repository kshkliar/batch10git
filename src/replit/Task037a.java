package replit;

import java.util.Scanner;

public class Task037a {

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
        boolean thirsty;
        boolean sleepy;
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        thirsty = scan.nextBoolean();
        System.out.println("Ara you sleepy?");
		sleepy=scan.nextBoolean();
        if (thirsty && !sleepy) {
            System.out.println("drink water");
        } else if (thirsty && sleepy) {
            System.out.println("drink coffe");
        } else if (!thirsty && sleepy) {
            System.out.println("drink tea");
        }else{
            System.out.println("drink nothing");
        }
    }

}
