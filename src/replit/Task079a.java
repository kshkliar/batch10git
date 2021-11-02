package replit;
/*Write a program to print values from a 2D array
Example Output:
1.4. 2.0. 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6

 */



public class Task079a {
    public static void main(String[] args) {


        double[][] array = {
                {1.4, 2.0,3.3,2.0},
                {4.0,1.5,6.1, 1.1},
                {1.2,3.1,4.0,1.6}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");

            }
            System.out.println();
        }



        System.out.println("-----Second way--Enhence for loop------");


        for (double[] a : array) {
            for (double b : a) {
                System.out.print(b+ " ");// перебрасываем через рядок
            }
            System.out.println();
        } //указываем тип переменной
              //узазываем лишь елемент
            }

        }





