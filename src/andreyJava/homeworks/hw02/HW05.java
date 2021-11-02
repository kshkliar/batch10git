package andreyJava.homeworks.two_dim_array;

/*Вычислить сумму элементов двумерного массива входящих в главную диагональ.
 */
public class HW05 {
    public static void main(String[] args) {
        double[][] array = {
                {5, 2, 3}, //а если бы число елементов строки было больше??
                {1, 5, 2},
                {1, 2, 3}
        };

        int sumD = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
//                    sumD += array[i][j];
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][i]);
           // sumD += array[i][i];//
        }

      //  System.out.println(sumD);

    }
}
