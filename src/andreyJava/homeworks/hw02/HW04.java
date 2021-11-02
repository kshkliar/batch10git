package andreyJava.homeworks.two_dim_array;

/*Вывести на экран среднее арифметическое каждого строки/столбца двумерного массива.*/
public class HW04 {

    public static void main(String[] args) {

        double[][] array = {
                {5, 2, 3, 7},// ( 5+2+3+7)/4=4.25  //сумма
                {1, 5, 2, 2},
                {1, 2, 3, 4}
        };
        double averageRow = 0;

        for (int i = 0; i < array.length; i++) {
            double sumOfRow = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumOfRow += array[i][j];
            }
            averageRow = sumOfRow / array[i].length;
            System.out.println("Среднее арифметическое  строки #" + (i + 1) + ": " + averageRow); // среднее строки

        }
        System.out.println();

        for (int i = 0; i < array[0].length; i++) {
            double sumCol = 0;

            for (int j = 0; j < array.length; j++) {
                sumCol += array[j][i];
            }
            System.out.println("Среднее арифметическое столбца #" + i + ": " + (sumCol / array[0].length));
        }//  можно ли вместо числа 4 , указать длину столбца другим способом?


    }
}
