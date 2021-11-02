package replit.Repl187;
/*Create an array list to type String.
Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array
print remained values one by one in one line
**Expected Output:**
yo yolo
```*/
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("hi");
        list.add("yo");
        list.add("sup");
        list.add("yolo");
        list.add("boop");
        list.remove(0);
        list.remove(1);// notice how size changes at run time
        list.remove(2);
        for(String elements:list){
            System.out.print(elements+" ");
        }

    }
}