package com.syntax.class09;

import java.util.Random;

class RandomValues1 {
    public static void main(String[] args) {
       Random random= new Random();



//        int randomValue = random.nextInt(51);//0..50
//        nextInt(max - min + 1) + min

        int randomValue=random.nextInt(40)+10; //10...49

        System.out.println(randomValue);
    }
}
