package replit.Repl197;
/*Create a set collection in which you do not want to preserve or sort the
 order and add below values to it.
Red
Pink
Yellow
White
Black
Print set collection
And get total number of colors available in the set
**Expected Output:**
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        HashSet<String> mySet=new HashSet<>();
        mySet.add("Red");
        mySet.add("Pink");
        mySet.add("Yellow");
        mySet.add("White");
        mySet.add("Black");
        System.out.println("Original Hash Set: "+mySet);
        System.out.println("Size of the Hash Set: "+mySet.size());
    }
}