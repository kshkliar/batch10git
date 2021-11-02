package replit;

import java.util.Scanner;

/*
Given the following inputs:
String s;
Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.
Sample input/outputs:
In: hello
h e l l o

In covert
c o v e r t
 */
public class Task103a {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        String s= scan.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+" ");
        }
    }

}
