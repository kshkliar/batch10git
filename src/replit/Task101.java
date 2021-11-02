package replit;

/*
Inputs:
String word;
Write a for loop that will print out every other letter in String ,
 starting with the first letter.
These letters should be printed all on line with no space in between.
Sample input/outputs
In:hello
hlo
In
 */


import com.sun.javaws.progress.PreloaderPostEventListener;

import java.util.Scanner;

public class Task101 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        String in = scan.nextLine();

        for (int i = 0; i < in.length(); i += 2) {
            String repl = in.replaceAll("\\s", "");
            System.out.print(repl.charAt(i));
        }

        }
    }

