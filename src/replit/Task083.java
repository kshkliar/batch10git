package replit;

/* Write a programe that calculates the sum of elements from each row in 2D array and adds
them into array of integers
For example, if we run rowSums for the following 2D array:
{

 */
public class Task083 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2},//sum=4
                {3, 1, 2},//sum=6
                {3, 5, 3},//sum=11
                {0, 1, 2}//sum=3
        };
        int sum;
        int[] rowSum = new int[a.length];// создаем array куда будм класт значениясумма радов( array sum ,sum of rows)
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];// сумма каждой строки
            }
            rowSum[i] = sum;// кладем значение которое при каждой итерации меняется
            System.out.println(rowSum[i]);
        }
        System.out.println("-----------------");
        System.out.println(a.length);
    }
}
