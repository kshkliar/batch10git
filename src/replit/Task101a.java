package replit;

/*
Inputs:
String word;
Write a for loop that will print out every other letter in String , starting with the first letter.
These letters should be printed all on line with no space in between.
Sample input/outputs
In:hello
hlo
In
 */


import java.util.Scanner;

public class Task101a {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String word =inp.nextLine();
        //Write code below

        for (int i = 0; i < word.length(); i += 2) {
            String replace = word.replaceAll("\\s", "");
            System.out.print(replace.charAt(i));
        }
        }
    }

