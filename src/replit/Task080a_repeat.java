package replit;
//Double and print array
//(double values of array indexes and print)
public class Task080a_repeat {
    public static void main(String[] args) {
        double[][] array = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };


        for (double[] a : array) {
            for (double b : a) {

                System.out.print((2*b)+ " ");
            }
            System.out.println();
        }

        System.out.println("-------------Another way------");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((2*array[i][j])+ " ");
            }
            System.out.println();
        }

        System.out.println("-----Another way---------");
        for (int i = 0; i < array.length; i++) {
            double[]doubleValues=array[i];
            for (int j = 0; j < doubleValues.length; j++) {
                System.out.print(2*(array[i][j])+ " ");
            }
            System.out.println();
        }



    }
}
