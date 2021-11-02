package replit;

/*
You have Scanner class to input string value.
If language is Java it should print the:
"Java is a programming language".
If Language is C in should print the:
"C is procedural programming language"
If language is C++ is a  middle-level programming language"
If any other should print:
Doesn t match any programming language
 */


import java.util.Scanner;

public class Task096a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your programming language");
        String answer = scan.nextLine();
        switch (answer) {
            case "Java":
                System.out.println("Java is programming language");
                break;
            case "C":
                System.out.println("C is procedural programming language");
                break;
            case "C++":
                System.out.println("C++ is a middle-level programming language ");
                break;
            default:
                System.out.println("Doesn t match any programming language");
        }
    }
}
