package replit.Repl202;
/*Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi
Extract all keys and it values and print them in the format below:
**Expected Output:**
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi*/
import java.util.Map;
import java.util.TreeMap;
class Main {
    public static void main(String[] args){
        Map<Integer,String> myMap=new TreeMap<>();
        myMap.put(1, "apple");
        myMap.put(2, "banana");
        myMap.put(3, "pear");
        myMap.put(4, "tomato");
        myMap.put(5, "mango");
        myMap.put(6, "kiwi");
        //using functional programming
      //  myMap.forEach((key,value)-> System.out.println("Key is "+key+" item and values is "+value));

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is " + key + " item and values is " + value);
        }
    }

}