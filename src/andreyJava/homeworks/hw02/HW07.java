package andreyJava.homeworks.two_dim_array;

/*В двумерном массиве Вывести максимальный/минимальный и
произведение элементов каждой строки
 */
public class HW07 {
    public static void main(String[] args) {


        int[][] array = {
                {5, 2, 3, 7},
                {1, 5, 2, 2},
                {1, 12, 3, 4}
        };
        System.out.println("-------Multiplication-------");
        for (int i = 0; i < array.length; i++) {

            int multRow = 1;
            int max = array[i][0];

            for (int j = 0; j < array[i].length; j++) {
                multRow += multRow * array[i][j];
            }
            System.out.println("The multiplication of " + (i + 1) + " row = " + multRow);
        }

        System.out.println("-------Min-------");
        for (int i = 0; i < array.length; i++) {

            int min = array[i][0];//принимаем за мин( что означает этот стартовый индекс)

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {// если мин больше значения данного индекса
                    min = array[i][j];// то мин равняется этому индексу , это как вообще?
                }


            }
            System.out.println("Min of row:" + min); //сделал но не догнал как
        }
        System.out.println("---Max-----");
        for (int i = 0; i < array.length; i++) {

            int max = array[i][0];//принимаем за макс

            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {// если макс меньше значение данного индекса
                    max = array[i][j];// то max равняется этому индексу , это как вообще?
                }


            }

            System.out.println(max);
        }
    }
}