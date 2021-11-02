package andreyJava.lessons.two_dim_array;

public class TwoDimArray {
    public static void main(String[] args) {
        int[] arr = {4, 8, 9};

        int[][] array = {
                {4, 7, 3},//0// индекс
                {0, 5,5, 4},//1
                {9, 1, 3}//2
        };
        System.out.println(array[2][2]);
        int[][] array1 = new int[4][4];//0

        /*
        * 7 - [0][1]
        * 5 - [1][1]
        * */

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
