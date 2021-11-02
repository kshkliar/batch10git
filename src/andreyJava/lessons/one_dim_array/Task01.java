package andreyJava.homeworks.homework.one_dim_array;

import java.util.Random;

/*
* Создать массив из 20 чисел, проинициализировать его элементы случайными
* числами от 23 до 57.
Вывести на консоль элементы если индекс элемента четный и элемент больше 30.
* */
public class Task01 {
    public static void main(String[] args) {

        int[] array = new int[20];//0
        array[0] = 4;
        array[1] = 6;
        array[2] = 8;

        Random random = new Random();

//        System.out.println(random.nextInt(30));//0-29
        System.out.println(random.nextInt(30));//nextInt(max - min + 1) + min

        for (int i = 0; i < array.length; ++i) {
//            array[i] = random.nextInt(57 - 23 + 1) + 23;
            int value = random.nextInt(35);//0-34
            array[i] = value + 23;
            System.out.print(array[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] > 30) {
                System.out.print(array[i] + "\t");
            }

        }
/*
* iter0: i == 0, array[0]
* iter1: i == 1, array[1]
* iter19: i == 19, array[19]
*
* */

    }
}
