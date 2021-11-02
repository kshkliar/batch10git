package replit;
/***For you to do:**
 Write a program that prints the highest value in the array.
 **Expected Output:**
 input [5,4,8]
 ```
 8
 ```*/
public class Task081a {
    public static void main(String[] args) {

        int[][] arr = {
                {5, 2, 3, 7},
                {1, 5, 1, 1},
                {8, 3, 1, 2}
        };
int max=arr[0][0];  //Initilize maximum element
        for (int[] a : arr) {
            for (int b : a) {
                if (b > max) {
                    max=b;
                }
            }
        }
        System.out.println(max);
        System.out.println(arr[0][0]);
          //Traverse array alements from second and
          //compare every element with current max

        System.out.println("-----Another way-------");

        }
}

