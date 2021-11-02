package com.collection.class28.collectionsDemo1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] arr={10,20,10,70,10};
        int number=10;
        System.out.println(Arrays.toString(remove(arr,number)));

    }
    public  static int [] remove(int [] arr,int number){
        int counter=0;
        for (int j : arr) {
            if (j == number) {
                counter++;
            }
        }
        int[] newArr= new int[arr.length-counter];
        int counter2=0;
        for (int j : arr) {
            if (j != number) {
                newArr[counter2] = j;
                counter2++;
            }
        }
        return  newArr;
    }
}
