package replit;

/*Write a program that will print the sum of all element in 2D array
Expected output:
-9
 */
public class Task082a_repeat {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;
        int mult =1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum=sum+=a[i][j];
                mult=mult*a[i][j];
            }
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}