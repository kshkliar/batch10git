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

public class Task105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            if (a == 'a' || a == 'e' || a == 'o' || a == 'i' || a == 'A' || a == 'E' || a == 'O' || a == 'U' || a == 'I') {
                System.out.println(a);
            }
        }
    }
}

