package andreyJava.homeworks.homework;

/*1) Задан целочисленный массив.
Определить остаток от деления суммы
элементов с четными  индексами на сумму элементов с
нечетными индексами.*/


import java.util.Random;

public class HW01 {

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

            System.out.println(array[i] + "\t");
        }
        System.out.println("Modulo= " + (sumEven % sumOdd));
    }
}