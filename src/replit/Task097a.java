package replit;
/*
Based on the user inputs program should give a correct answer.
If browser is Chrome or Chrome or CHROME or ChrRome it should print the:
"Proceed with Chrome browser"
If browser is IE, ie  or IE it should print the:
"Proceed with IE browser"
If any other browser it should print the:
"Invalid Browser"

*/

import java.util.Scanner;

public class Task097a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the browser name to proceed futher with execution");
        String browser = scan.nextLine();
        switch (browser) {
            case "Chrome":
            case "CHrome":
            case "CHROME":
                System.out.println("Proceed with Chrome browser");
                break;
            case "IE":
            case "ie":
            case "Ie":
                System.out.println("Proceed with IE browser");
                break;
            case "firefox":
            case "FIREFOX":
            case "Fire fox":


                System.out.println("Proceed with Fire Fox browser");

            default:
                System.out.println("Invalid browser");
        }
    }
}

