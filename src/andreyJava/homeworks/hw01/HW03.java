package andreyJava.homeworks.homework;

import java.util.Random;

/*Создайте массив из 8 случайных целых чисел из отрезка [1; 10].
Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке.
*/
public class HW03 {
    public static void main(String[] args) {

        int[] array = new int[8];//0

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);

            System.out.print(array[i] + "\t");

        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0; // сработало но не удалось соблюсти последовательность

            }
            System.out.print(array[i] + "\t");

        }


    }


}



