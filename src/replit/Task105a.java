package replit;

/*
There is a code that takes input as a String.
Write a program that will print out vowels of that string
Sample input/outputs:
In: howdyho
oo

In:huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */


import java.util.Scanner;

public class Task105a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        String input= scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char a=input.charAt(i);
            if (a == 'a' || a == 'i') {
                System.out.println(a);
            }
        }
    }

}
