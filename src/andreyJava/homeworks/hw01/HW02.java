package andreyJava.homeworks.homework;
/*int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
Write code which calculates
1.) the maximum value from the array,
2.) the minimum value and the average.
*/
import java.util.Random;
public class HW02 {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + "\t");
        }
        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int b = 0; b < array.length; b++) {
            if (array[b] < min) {
                min = array[b];
            }
            if (array[b] > max) {
                max = array[b];
            }
            sum = sum + array[b];
        }
        int aver = sum / array.length;
        System.out.println("\nMIn= " + min + " " + "\nMax=" + max + "\nAverage=" + aver);

    }
}
