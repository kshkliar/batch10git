package com.alishev.arrays;

public class Class11arrays {

    public static void main(String[] args) {
        int number = 10; //примити4ный тип данных  [10]
        int[] numbers = new int[5];// numbers ->ссылочный тип данных(это способо
        //когда мы создаем масси4 с пустыми ячейками и уже потом хотим какие то числа помещать 4 него
        // System.out.println(numbers[0]);  //0 1 2 3 4
        // System.out.println(numbers[4]);
        //   numbers[0]=10;
        //  numbers[1]=20;  //можно делать так, но если маси4 большой то используем цикл for

        for (int i = 0; i < numbers.length; i++) {  //теперь каждую итерацию мы будем помещать 4 индеки i*10:
            numbers[i] = i * 10;  // так как i это наз4ание ссылки а не значение которое мы 4клады4аем
            //то мы можем использо4ать цикл, просто i у нас назы4аеться сссылка i -элемент(индекс) масси4а
             System.out.println(numbers[i]);
        }
        System.out.println("-----");
        int[]number1={1,2,3}; //заранее знаем какие числа хотип поместить
        for (int i=0;i<number1.length;i++)
        System.out.println(number1[i]);//4ы4од содержимого масси4а

    }
}