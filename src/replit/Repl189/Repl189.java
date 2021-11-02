package replit.Repl189;
/*Create a Linked List that will store Integer Objects from 50-100.
Once Linked List is created remove all numbers that are not divisible by 3.
Print Linked List
**Expected Output**
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]*/
import java.util.*;
class Main {
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=50;i<=100;i++){
            list.add(i);
        }
      //  list.removeIf(num -> num % 3 != 0); best practice
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next%3!=0){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}