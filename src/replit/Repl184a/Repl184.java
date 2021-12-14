package replit.Repl184a;
/*# ArrayList
Create a array list that will hold Integer Objects:
Add below elements to it.
111 222 333 444 555 666
Print first, third and fifth element from your array
**Expected Output:**
111 333 555*/
import java.util.ArrayList;

class Repl184 {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(111);
        myArrayList.add(222);
        myArrayList.add(333);
        myArrayList.add(444);
        myArrayList.add(555);
        myArrayList.add(666);


        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(2));
        System.out.println(myArrayList.get(4));

    }
}