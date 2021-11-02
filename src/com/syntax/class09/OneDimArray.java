package com.syntax.class09;

import java.util.Random;

public class OneDimArray {
    public static void main(String[] args) {
        int[] array = new int[30];//0

       /* array[0] = 10;
        array[1] = 5;
        array[2] = 6;
//        ....
        array[29] = 1;*/

        /*for (int i = 0; i < 30; i++) {//10000 < 10000 = 9999
            array[i] = i + 2;
            System.out.print(array[i] + "\t");
        }*/

        Random random = new Random();

        for (int i = 0; i < 30; i++) {//10000 < 10000 = 9999
            array[i] = random.nextInt(30);
            System.out.print(array[i] + "\t");
        }

        /*
        * iter 0; i == 0 array[0] = 0 + 2
        * iter 1; i == 1 array[1] = 1 + 2
        * */
    }
}

class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();

//        int randomValue = random.nextInt(51);//0..50
//        nextInt(max - min + 1) + min
        int randomValue = random.nextInt(40) + 10;//10..49

        System.out.println(randomValue);
    }
}
