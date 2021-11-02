package andreyJava.homeworks.homework;

import java.util.Random;

/*
 В массиве целых чисел с количеством элементов 19 определить максимальное число
 и заменить им все четные по значению элементы.

 */
public class HW05 {
    public static void main(String[] args) {
        int[] array = new int[19];

        Random random = new Random();

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(19);

            if (array[i] > max) {
                max = array[i];
            }
            System.out.print(array[i] + "\t");

        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = max;
            }
            System.out.print(array[i] + "\t");

        }

        System.out.println("\nMax=" + max);


        //  System.out.print(array[i]+"\t"); //не сработало
    }
}

