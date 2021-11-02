package andreyJava.homeworks.homework.one_dim_array;

import java.util.Random;

/*
*
* Задан целочисленный массив. Определить остаток от деления суммы
элементов с четными  индексами на сумму элементов с нечетными индексами.
* */
public class Task03 {
    public static void main(String[] args) {

        int[] array = new int[20];

        Random random = new Random();

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(57 - 23 + 1) + 23;

            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }


            System.out.print(array[i] + "\t");
        }

        System.out.println("Modulo = " + (sumEven % sumOdd));




    }
}
