package com.replit;
import java.util.Scanner;

public class Problem_032 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        char gender;
        int age;

        System.out.println("Please enter your gender: M or F");
        gender=scanner.next().charAt(0);
        System.out.println("Please enter your age");
        age=scanner.nextInt();
        if(age>25){
            if(gender=='F'){
                System.out.println("Woman");
            }else {
                System.out.println("Man");
            }
        }else{
            if(gender=='F'){
                System.out.println("Girl");
            }else {
                System.out.println("Boy");
            }
        }

    }
}
