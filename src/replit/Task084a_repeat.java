package replit;
/* Write a program that prints the total number of elements that are negative AND odd
Output:
3
 */
public class Task084a_repeat {
    public static void main(String[] args) {
        int [][]a= {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
int counter=0;// создаем счетчик
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 == -1) {
                    counter++;

                }
            }  //луп 1
            // луп 2
        }    //условие негативное и отрицательное
            //коунтер
            System.out.println(counter);
                }
            }


       //вывод в консоль

