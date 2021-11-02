package replit;
/*For you to do:
Ask the user to enter any number
if a user enters a number and it is even, print "Value is even", otherwise print
"Value is odd" and prints Odd value is just right
If the number is even then check if it is greater than 1000 or not.
If the number is greater than 1000, then print "Even value is large", else print
"Even value is just right".
Example Output:
Please enter a number
Please enter a number
Value is odd
Value is odd
Example Output:*/

import java.util.Scanner;

public class Problem_033a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("The value is even");
            if (num > 1000) {
                System.out.println("Even value is large");
            } else {
                System.out.println("Even value is just right");
            }

        } else {
            System.out.println("The value is odd");

            if (num > 1000) {
                System.out.println("The odd number is large");

            }else{
                System.out.println("Odd value is just right");
            }
        }
    }
}