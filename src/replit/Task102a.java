package replit;

/*
Inputs:
String word;
Write a for loop that will loop through every character of a word
and print out each character, each on a separate line
Sample inputs/outputs:
in: hello

 */


import java.util.Scanner;

public class Task102a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("In:");
        String word=input.nextLine();


        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+ "\t");
        }
        }
    }

