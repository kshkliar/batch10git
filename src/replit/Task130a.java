package replit;
/* Create the mystery method so that it takes in an integer array
as a parameter , and then modifies
each element based on whether it is even or odd. //for loop
If the number is even , divide it by 2. //первое условие if
If it is odd, multiply it by 10.// иначе - else
Expected Output:
10 1 30 2 50
 */


public class Task130a {

    static void mystery(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i]/2+ " ");
            }else{
                System.out.print(array[i]*10+ " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        mystery(a);
    }

           // массив тоже класс как и стринг

        //should print out 10 1 30 2 50
    }

