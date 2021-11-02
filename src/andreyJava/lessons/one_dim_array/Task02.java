package andreyJava.homeworks.homework.one_dim_array;

import java.util.Random;

/*
* Создать массив из 20 чисел, проинициализировать его элементы случайными числами от 23 до 57.
Вывести на консоль элементы если индекс элемента четный и элемент больше 30.
* */
public class Task02 {
    public static void main(String[] args) {

        int[] array = new int[20];

        Random random = new Random();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(57 - 23 + 1) + 23;

            sum += array[i];

            System.out.print(array[i] + "\t");
        }

        System.out.println("\nSum = " + sum);




    }
}
