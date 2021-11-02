package replit.Repl198;
/*# TreeSet
Create Set to store String Objects and you want them to be stored in ascending order
Please add the below values and see the result
`"India"`
`"Australia"`
`"South Africa"`
`"India"`
`"America"`
`"America"`
Print the Set.
`Expected Output:`

[America, Australia, India, South Africa]*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        TreeSet<String> mySet = new TreeSet<>();
        mySet.add("India");
        mySet.add("Australia");
        mySet.add("South Africa");
        mySet.add("India");
        mySet.add("America");
        mySet.add("America");
        System.out.println(mySet);
    }
}