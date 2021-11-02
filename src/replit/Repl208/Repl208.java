package replit.Repl208;
/*# HashMap, Methods, reusability, Logic
Create a Method in Main class using below specification.
Method Name: Display.
Return Type: Void
Parameters : Map<String,Integer>
Logic:
First the method will check the given map is empty or not.
If the map is not empty print pairs of key and value using loops
If map is empty simply print "map is empty"
**NOW IN MAIN METHOD**
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
using created display method to display.
then clear the map.
use the same method to display*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class Main {
    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("mango", 10);
        myMap.put("apple", 30);
        myMap.put("orange", 20);
        Display(myMap);
        myMap.clear();
        Display(myMap);
    }
    static void Display(Map<String,Integer> myMap){
        if(myMap.isEmpty()){
            System.out.println("map is empty");
        }else {
            Iterator<Map.Entry<String,Integer>>iterator=myMap.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String,Integer>it=iterator.next();
                System.out.println(it.getKey()+" : "+it.getValue());
            }
        }
    }
}