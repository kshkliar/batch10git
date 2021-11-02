package com.syntax.class09;

public class ArrayIntro1 {

    public static void main(String[] args) {


        int num = 10;
        num = 11;
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 10;
        System.out.println(arr[2] + arr[0]);//40

        // I want to store week days

String []days=new String[7];
days[0]="Monday";
days[1]="Tuesday";
days[2]="Wednesday";
days[3]="Thuesday";
days[4]="Friday";
days[5]="Saturday";
days[6]="Sunday";
        System.out.println(days[5]+ " "+ days[6]);
        days [6]="10";
        System.out.println(days[5]+ " "+ days[6]);
    }
}
