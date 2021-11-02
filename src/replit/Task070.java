package replit;

/*Write a program that creates an array of integers and stores the following values:45, 78, 12, 67, 55
and than prints all array values
 */

public class Task070 {
    public static void main(String[] args) {
        int [] values = {45, 78, 12, 67, 55};
        for (int i=0; i<values.length;i++){
            System.out.print(values[i]+ " ");
        }
    }
}
