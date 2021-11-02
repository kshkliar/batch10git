package replit;
/*For you to do:
Ask the user to enter his/her gender "Please enter your gender: M or F" and their
 age "Please enter your age"
You have 2 conditions:
If age is above 25, then check if a user entered F then the output should be "Woman"
otherwise it should say "Man"
If age is below 25, then check if a user entered F then the output should be "Girl"
otherwise it should say "Boy"*/

import java.util.Scanner;

public class Problem_032a {
    public static void main(String[] args) {

        char gender;
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        gender = scanner.next().charAt(0);
        System.out.println("Please enter your age");
        age = scanner.nextInt();
        if (age > 25) {
            if (gender == 'F') {
                System.out.println("Women");
            } else {
                System.out.println("Man");
            }
        } else if (age < 25) {
            if (gender == 'F') {
                System.out.println("Girl");
            } else {
                System.out.println("Boy");
            }
        }
    }
}
