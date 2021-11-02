package andreyJava.homeworks.homework.one_dim_array;

import java.util.Random;

// cумму элементов колл
public class Task05 {
    public static void main(String[] args) {

        int[] array = new int[30];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
            System.out.print(array[i] + "\t");
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("\nMax = " + max);
    }
}
