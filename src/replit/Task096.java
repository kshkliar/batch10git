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

public class Task096 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language= sc.nextLine();

        switch(language){
            case"Java":
                System.out.println("Java is a programming language");
                break;
            case"C":
                System.out.println("C is a procedural language");
            case"C++":
                System.out.println("C++ is a midddle-level programming language");
                break;
            default:
                System.out.println("Does t match any programming language");
        }
    }
}
