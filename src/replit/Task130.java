package replit;
/* Create the mystery method so that it takes in an integer array as a parameter ,
and then modifies
each element based on whether it is even or odd.
If the number is even , divide it by 2. If it is odd, multiply it by 10.
Expected Output:
10 1 30 2 50
 */


public class Task130 {

    static void mystery(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] / 2 + " ");
            } else {
                System.out.print(array[i] * 10 + " ");
            }
        }
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        mystery(a);
    }// tester
        // инициализируем массив тоже обьект как и стринг

        //should print out 10 1 30 2 50
    }

