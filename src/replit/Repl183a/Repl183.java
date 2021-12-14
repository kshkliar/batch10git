package replit.Repl183a;
/*# ArrayLists
Create an array list that will hold String Objects
Find out wether array list is empty or not.
Add String value "Syntax" to it
Find out wether array list is empty or not.
**Expected Output:**

true
false*/

import java.util.ArrayList;

class Repl183 {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        System.out.println(myArrayList.isEmpty());

        myArrayList.add("Syntax");
        System.out.println(myArrayList.isEmpty());
    }
}