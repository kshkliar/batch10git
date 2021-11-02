package replit.Repl196;
/*Create a Set and and below values to it.
[third, first, second]
Print HashSet and then remove all the elements from Hashset and print it again.
**Expected Output:**
[third, first, second]
[]*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        HashSet<String> mySet=new HashSet<>();
        mySet.add("third");
        mySet.add("first");
        mySet.add("second");
        System.out.println(mySet);
        mySet.clear();
        System.out.println(mySet);
    }
}