package com.syntax.class07;

import java.util.Scanner;

public class Lotterey1 {

    /*
     * we have a secret number (any number from 1 till 20) ask user to guess your
     * secret number continue guessing a number UNTILL user enter your secret number
     * once guessed let's say Congratulations you got it!
     */

    public static void main(String[] args) {
        Scanner scan;
        int userNumber, secretNumber;
        secretNumber = 15;
        scan = new Scanner(System.in);
        do{
            System.out.println("Plese guess my secret number range from 1 till 20");
            userNumber=scan.nextInt();
        }while(userNumber!=secretNumber);
        System.out.println("Congratulations you got it! ");
    }
}
