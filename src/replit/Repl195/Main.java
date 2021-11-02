package replit.Repl195;
/*Create the HashSet with list of Integers add the below numbers for the list
111
111
111
999
999
999
Print elements one by one.
**Expected Output**
999
111*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        HashSet<Integer> mySet=new HashSet<>();
        mySet.add(111);
        mySet.add(111);
        mySet.add(111);
        mySet.add(999);
        mySet.add(999);
        mySet.add(999);
      //  mySet.forEach(System.out::println); using lambdas
        for (Integer i:mySet
             ) {
            System.out.println(i);
        }
    }
}