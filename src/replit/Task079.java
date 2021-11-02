package replit;
/*Write a program to print values from a 2D array
Example Output:
1.4. 2.0. 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6

 */



public class Task079 {
    public static void main(String[] args) {
        double[][] a = {
                {1.4, 2.0, 3.3, 2.0},
        {4, 1.5, 6.1, 1},
        {1.2, 3.1, 4, 1.6}
    };

        for (double[] doubles : a) {
            for(double aDouble:doubles){// узазываем обязательно тип переменной
                System.out.print(aDouble+ " ");
            }
            System.out.println();
        }
        System.out.println("----Second way--------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= a[i].length-1; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
