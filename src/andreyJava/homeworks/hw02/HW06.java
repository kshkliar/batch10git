package andreyJava.homeworks.two_dim_array;

/*В двумерном массиве Необходимо найти и вывести наибольший, наименьший элемент,
сумму всех элементов каждого столбца.*/
public class HW06 {
    public static void main(String[] args) {

        double[][] array = {
                {5, 2, 3, 7, 5},
                {1, 5, 2, 2, 8},
                {1, 12, 3, 4, 7},//2
                {1, 12, 3, 4, 2}//2
        };


        for (int i = 0; i < array[0].length; i++) {// чего всегда пишем< а сейчас <=
            double sumCol = 0;
            for (int j = 0; j < array.length; j++) {//  сделал но не очень понял как путем подбора
                sumCol += array[j][i];// тут подсказал интелиджи
            }
            System.out.println("The sum of elements in the column " + (i + 1) + ": " + sumCol + " ");
        }
        System.out.println("---Max-----");

        for (int i = 0; i < array[0].length; i++) {
            double max = array[0][i];// какой это элемент на старте
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] > max) {
                    max = array[j][i];// не сосем догнал мы же должны указывать в начале строку
                }
            }
            System.out.println("Max: " + max);
        }
        System.out.println("---Min-----");

        for (int i = 0; i <= array.length; i++) {
            int min = (int) array[0][i];// какой это элемент на старте
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] < min) {
                    min = (int) (array[j][i]);// не сосем догнал мы же должны указывать в начале строку
                }
            }
            System.out.println("Min: " + min);
        }
    }
}