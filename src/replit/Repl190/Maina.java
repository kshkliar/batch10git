package replit.Repl190;
/*Create Linked List that will store first 10 numbers of fibonacci series
Print number from Linked List 1 by 1 all in 1 line
**Expected Output:**
0 1 1 2 3 5 8 13 21 34
```*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Maina {
    public static void main(String[] args){
        List<String> grocery = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        for (int i = 0; i < 8; i++) {
            list.add(list.get(i) + list.get(i + 1));
            //добавляет то что в скобках - елемент+ елемент +1
        }
        list.forEach(i-> System.out.print(i+" "));
    }
}