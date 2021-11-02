package andreyJava.homeworks.two_dim_array;

import java.util.Random;

//В двумерном массиве целых чисел определить, сколько раз в нем встречается элемент со
// значением X.
public class Task01 {

    public static void main(String[] args) {
        int[][] array = new int[4][4];

        int searchValue = 5;
        int count = 0;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(8);
                if (array[i][j] == searchValue) {
                    count++;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println("Count =" + count);
    }

}
