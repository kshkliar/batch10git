package replit;
/*
Using Scanner class input string value.
Print out the following: "The first 3 letters of __is__"
For example, if the input is "banana", your output should be:"The first 3 letters of banana is ban".

 */


import java.util.Scanner;

public class Task095 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String value =scan.nextLine();

        String letters= value.substring(0,3);
        System.out.println("The first 3 letters of " +value + " is " + letters);

    }
}
