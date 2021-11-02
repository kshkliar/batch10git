package com.syntax.class09;

public class MoreArrays1 {

    public static void main(String[] args) {

        double[] d = new double[4];

        //arrays are fixed in size
        //during execution, when java runs code --> it cannot increase
        // the size


        d[1] = 10.99;
        d[2] = 12.99;
        d[3] = 10;

        //d[4]=1.99; //ArrayIndexOutOfBounds

        System.out.println(d[3]);

        int[] numbers = new int[2];
        numbers[0] = 100;
        numbers[1] = 200;
        System.out.println(numbers[1]);
        int num;//declare a variable
        num = 10;

        int arrayVar[]; //declare an array
        int[] arr;  //declare an array  --> PREFERRABLE
        arr = new int[3];
        arr[0] = 10;
        System.out.println(arr[1]);//0
    }
}
