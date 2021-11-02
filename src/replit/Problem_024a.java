package replit;/*
Write a program that takes a user's name and prints it.
Example Output:
Hello, please enter your name
Your name is Sumair
 */

import java.util.Scanner;

public class Problem_024a {
    public static void main(String[] args) {


        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, enter your name");
        name = scan.next();
        System.out.println("Your name is "+name);

    }
}
