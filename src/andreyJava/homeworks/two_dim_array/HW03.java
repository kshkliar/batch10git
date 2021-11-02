package andreyJava.homeworks.two_dim_array;

import java.util.Random;

/*Создать двумерный массив(размер 20) и заполнить его числами от 10 до 50
    Вывести в консоль элемент массива если сумма значения индекса строки и столбца
    является четным числом*/
public class HW03 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        Random random = new Random();

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

                if ((i + j) % 2 == 0) {
                    System.out.print(array[i][j] + "\t");
                }
               // System.out.println(i + ":" + j);//индексы

            }
        }
    }
}