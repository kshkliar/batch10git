package andreyJava.homeworks.homework.one_dim_array;

import java.util.Random;

//Даны два массива действительных чисел по 12 элементов в каждом.
//Заменить нулями те элементы первого массива, которые есть во втором.
public class Task09 {

    public static void main(String[] args) {
        int[] array1 = new int[12];
        int[] array2 = new int[12];
        Random random = new Random();

        System.out.println("First array");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20);
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        System.out.println("Second array");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(20);
            System.out.print(array2[i] + "\t");
        }

        for (int i = 0; i < array1.length; i++) {
            int elementFirstArray = array1[i];

            for (int j = 0; j < array2.length; j++) {
                if (array2[i] == elementFirstArray) {
                    array1[i] = 0;
                }
            }
        }
    }
}
