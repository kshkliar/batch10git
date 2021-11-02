package replit;

/* Write a programe that calculates the sum of elements from each row in 2D array and adds
them into array of integers
For example, if we run rowSums for the following 2D array:
{

 */
public class Task083a_repeat {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2},//sum=4
                {3, 1, 2},//sum=6
                {3, 5, 3},//sum=11
                {0, 1, 2}//sum=3
        };


 int []rowSum=new int[a.length];    // обьявляем этот новый аррей
        for (int i = 0; i < a.length; i++) {
            int sum=0;
            for (int j = 0; j < a[i].length; j++) {
                 sum=sum +=a[i][j];
            }
            rowSum[i]=sum;
            System.out.println(rowSum[i]);
        }     //loop 1
         //обьявляем переменная сумма
           //внутренний луп
           //накапливаем сумму еедементов
            }
       //кладем значение после каждой итерации внутреннего цикла

        }





