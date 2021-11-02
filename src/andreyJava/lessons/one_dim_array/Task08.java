package andreyJava.homeworks.homework.one_dim_array;

import java.util.Random;

/*Дан массив чисел. В массиве числа в диапазоне от -15 до 15.
Выяснить, имеются ли в данном массиве два идущих подряд
положительных элемента. Подсчитать количество таких пар.
 */
public class Task08 {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 15;//15 + 15 + 1 -15

            System.out.print(array[i] + "\t");

        }

        System.out.println("\n--------");

        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > 0 && array[i + 1] > 0) {
                count += 1;

                System.out.println(array[i] + " " + array[i + 1]);
            }

        }
        System.out.println("Count pairs = " + count);

    }
}
