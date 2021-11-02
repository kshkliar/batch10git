package andreyJava.homeworks.homework.one_dim_array;

import java.util.Random;

/*Дан массив  − 19  элементов целого типа. Найти сумму элементов,
 расположенных до первого отрицательного элемента. Если отрицательных
элементов нет, то выдать соответствующее сообщение.

 */
public class Task07 {
    public static void main(String[] args) {

        int[] array = new int[19];
        Random random = new Random();
        int sum = 0;

        boolean isNegative = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(35) - 5;
            if (array[i] > 0) {
                sum += array[i];
            } else {
                isNegative = true;
                break;
            }

            System.out.print(array[i] + "\t");

        }

        if (isNegative) {
            System.out.println("There are negative elements");
        }


    }
}
