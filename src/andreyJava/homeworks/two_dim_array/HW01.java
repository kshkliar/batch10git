package andreyJava.homeworks.two_dim_array;

import java.util.Random;

/*1) Найти max, min, avg, произвдение,
сумму чисел в двумерном массиве*/
public class HW01 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        Random ran = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ran.nextInt(10) + 1;
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        int min = array[0][0];
        int max = array[0][0];
        int sum = 0;
        int multiply = 1;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] != 0) {
                    multiply = multiply * array[i][j];
                }
                sum = sum + array[i][j];

                ++count;
            }

        }
        double average = sum * 1.0 / count;  // не верно
        System.out.println("Min= " + min + " " + "\nMax= " + max + " \nMultiplication= " + multiply + "\nAverage=" + average);

    }
}

/*
*
2 9 7
6 7 8 3 1
8 4 4 7 3
10 2
6 2 9 3 2
* */