package replit;

/*
Inputs:
String word;
Write a for loop that will loop through every character of a word and print out each character, each on a separate line
Sample inputs/outputs:
in: hello

 */


import java.util.Scanner;

public class Task102 {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("In:");
        String word =inp.nextLine();
        //write your code below

        for (int i=0; i<word.length();i++){
            System.out.println(word.charAt(i));
        }
    }
}
