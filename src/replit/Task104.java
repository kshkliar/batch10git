package replit;
/*
Create an array of names that will hold 5 String elements.
Names must be taken from a user.
Print out the first threee characters of each element of the array, one per line.
Note: every array elements must be at least 3 characters long.
Input Example:
 */


import java.util.Scanner;

public class Task104 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);// создаем обьект и метод
        String [] arr =new String [5];// создаем второй обьект массив;

        int i;
        for (i =0; i<arr.length; i++){
            arr [i] = input.nextLine();

        }
        for (String ar : arr){
            System.out.println(ar.substring(0, 3));
        }
    }
}
