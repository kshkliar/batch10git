package andreyJava.homeworks.homework.one_dim_array;

import java.util.Random;

/*
 *
 *Вывести в консоль положительные элементы массива. Диапазон элементов
 * массива от -15 до 15
 * */
public class Task04 {
    public static void main(String[] args) {

        int[] array = new int[20];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 15;

            System.out.print(array[i] + "\t");

        }

        System.out.println();

        int sumNegative = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                sumNegative += array[i];
            }

        }

        System.out.print("Sum negative = " + sumNegative);
    }
}
