package replit.Repl169;
/***For you to do:**
 Create final method avgElements that will average all the
 elements in an integer array
 (passed to the method as a parameter) and return the average.
 **Expected Output:**
 4.8
 ```*/
import java.util.Arrays;

class Maina {

    final double avgElements(int[] i) {
     return Double.valueOf(Arrays.stream(i).sum())/(double)i.length;
    }


    public static void main(String[] args) {
        int[]i={2,7,3,8,4};
        System.out.println(new Maina().avgElements(i));
    }
}