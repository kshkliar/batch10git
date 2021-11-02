package replit.Repl193;
/*Create Linked List that will store Integer Objects
Add the values below:
111
222
333
444
555
666
Create a logic to calculate sum of the all the values in list.
Print the result of sum.
**Expected Output:**
Result of sum is 2331*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        //Integer sum = list.stream().reduce(0, Integer::sum);
        int sum=0;
        for (Integer i:list
             ) {
            sum+=i;
        }
        System.out.println("Result of sum is "+sum);
    }
}