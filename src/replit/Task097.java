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

public class Task097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed futher with execution");
        String browser = sc.nextLine();

        switch (browser) {
            case "Chrome":
            case "CHROME":
            case "ChroME":
                System.out.println("Proceed with Chrome Browser");
                break;

            case "firefox":
            case "FIREFOX":
            case "fireFOX":
                System.out.println("Proceed with Firefox browser");
                break;

            case "IE":
            case "ie":
            case "Ie":
                System.out.println("Proceed with IE browser");
                break;


            default:
                System.out.println("Invalid browser");

        }
    }
}
