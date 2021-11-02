package andreyJava.homeworks.homework.one_dim_array;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31)-15;

            sum += array[i];
            System.out.print(array[i] + "\t");

        }

        double avg = sum * 1.0f / array.length;//

        System.out.println("Avg = " + avg);
    }
}
