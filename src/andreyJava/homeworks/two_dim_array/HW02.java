package andreyJava.homeworks.two_dim_array;

import java.util.Random;

/*2)В двумерном массиве натуральных случайных чисел от 10 до 99
найти
 количество всех двухзначных чисел, у которых сумма цифр кратная 2.
 23 / 10 = 2
 23 % 10 = 3
 13 = 1 + 3 = 4( 1-к и 3 ед)*/
public class HW02 {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        Random random = new Random();

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(99 - 10 + 1) + 10;

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                int dozens = array[i][j] / 10;
                int ones = array[i][j] % 10;

                if ((dozens + ones) % 2 == 0) {
                    count++;
                    System.out.println(array[i][j]);

                }
            }
        }
        System.out.println(count);
    }
}