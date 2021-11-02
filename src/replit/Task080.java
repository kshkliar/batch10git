package replit;
//Double and print array

public class Task080 {
    public static void main(String[] args) {
        double[][] array = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };
        System.out.println("-----------------First way-----------------");
        for (double[] doubles : array) {
            for (double aDouble : doubles) {
                System.out.print((2 * aDouble) + " ");
            }
            System.out.println();

        }
        System.out.println("--------Another way--------");
        for (int i = 0; i < array.length; i++) {
            double[] doubles = array[i];// какое действие я здесь совершаю
// просто помести ли значение array[i] в переменную doubleValue
            for (int j = 0; j < doubles.length; j++) {
                System.out.print((2 * doubles[j]) + " ");
            }
            System.out.println();
        }
        System.out.println("-------------Another way------");

        for (int i = 0; i < array.length; i++) {
            double[] doublesValue = array[i];// declare variable and assign value(initialize)
// просто помести ли значение array[i] в переменную doubleValue
            for (int j = 0; j < doublesValue.length; j++) {
                System.out.print((2 * array[i][j]) + " ");
            }
            System.out.println();

        }

    }
}