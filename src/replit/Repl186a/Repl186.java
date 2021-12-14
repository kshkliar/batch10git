package replit.Repl186a;
/*# ArrayList Remove
Create an Arraylist of type Integer.
Add below elements to it.
111
222
333
444
555
666
Print the ArrayList.
remove all the elements.
Print the Arraylist.
**Expected Output:**
[111, 222, 333, 444, 555, 666]
[]*/
import java.util.ArrayList;

class Repl186 {
    public static void main(String[] args){
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(111);
        myArrayList.add(222);
        myArrayList.add(333);
        myArrayList.add(444);
        myArrayList.add(555);
        myArrayList.add(666);
        System.out.println(myArrayList);
        myArrayList.clear();
        System.out.println(myArrayList);
    }
}