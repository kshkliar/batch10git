package com.collection.class28.collectionsDemo1a;

import java.util.Arrays;

public class Issues {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);
        int[] numArr = new int[1000000];
        numArr[0] = 12;
        numArr[1] = 120;
        numArr[2] = 125;
        System.out.println("Size of the arr before increase" + numArr.length);

        int[] newBiggerArr = new int[4];
        newBiggerArr[0] = numArr[0];
        newBiggerArr[1] = numArr[1];
        newBiggerArr[2] = numArr[2];
        newBiggerArr[3] = 100;
        numArr=newBiggerArr;

        // write a method that takes an array and a number if number is present
        //inside that array delete it how create a new array of lesser size copy
        // elements and return it 12:05
        System.out.println(numArr[3]);
        System.out.println("Size of the arr after increase" + numArr.length);
        System.out.println(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
