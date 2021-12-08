package replit.Repl169;
/***For you to do:**
 Create final method avgElements that will average all the elements in an integer array
 (passed to the method as a parameter) and return the average.
 **Expected Output:**
 4.8
 ```*/
import java.util.Arrays;

class Main {

    final  double avgElements(int[] a){
       return Double.valueOf(Arrays.stream(a).sum())/(double)a.length;

    }

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(new Main().avgElements(a)); //should print 4.8
    }
}