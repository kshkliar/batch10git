package andreyJava.lessons.two_dim_array;

public class WorkWithRows {
    public static void main(String[] args) {

        int[][] array = {
                {4, 7, 3},//0// индекс
                {0, 5, 4},//1
                {9, 1, 3}//2
        };

        //work with rows

        for (int i = 0; i < array.length; i++) {

            int sumRow = 0;    //
            int max = array[i][0];

            for (int j = 0; j < array[i].length; j++) {
                sumRow += array[i][j];
            }
            System.out.println("Sum of " + i + " row = " + sumRow);
        }

        //work with columns

        for (int i = 0; i < 3; i++) {

            int max = array[0][i];

            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j][i]);
            }
        }
    }
}
