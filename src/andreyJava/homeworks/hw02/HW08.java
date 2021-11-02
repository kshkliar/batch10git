package andreyJava.homeworks.two_dim_array;

/*Дан двумерный массив целых чисел. Вычислить сумму элементов первой и последней
строк данной матрицы.*/
public class HW08 {


    public static void main(String[] args) {

        int[][] array = {
                {4, 7, 3},
                {0, 5, 4},
                {9, 1, 3}//2
        };

//        String first = "first";// как вывести в консоль
        String last = "last";
        String result = "first";

        for (int i = 0; i < array.length; i++) {
            int sumD = 0;

            if (i == array.length - 1) {
                result = last;
            }
            for (int j = 0; j < array[i].length; j++) {
                sumD += array[i][j];
            }
            System.out.println("The sum of " + result + " row is " + sumD);
        }

        int sumFirstRow = 0;
        int sumLastRow = 0;

        for (int i = 0; i < array.length; ++i) {
            sumFirstRow += array[0][i];
            sumLastRow += array[array.length - 1][i];
        }
 /*       System.out.println("Sum of first row = " + sumFirstRow);
        System.out.println("Sum of last row = " + sumLastRow);*/
    }


}

