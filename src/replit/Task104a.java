package replit;
/*
Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
Input Example:
John
Jane
Jimmy
Mike
Emily */


import java.util.Scanner;

public class Task104a {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];
        System.out.println("Please enter 5 names");
        int i;
        for (i = 0; i < array.length; i++) {
            array[i]= scan.nextLine();
        }
        for (String arr : array) {
            System.out.println(arr.substring(0,3));
        }


    }
}
