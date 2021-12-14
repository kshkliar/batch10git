package replit.Repl185a;
/*# ArrayList Loop
Create an arrayList of type Integer.
add below values.
111 111 111 999 999 999
Print all the values of List 1 by 1:
**Expected Output:**
111 111 111 999 999 999*/

import java.util.ArrayList;

class Repl185 {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(111);
        myArrayList.add(111);
        myArrayList.add(111);
        myArrayList.add(999);
        myArrayList.add(999);
        myArrayList.add(999);

        for (Integer number : myArrayList) {
            System.out.println(number);
        }
    }
}