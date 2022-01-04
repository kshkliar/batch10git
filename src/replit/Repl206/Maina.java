package replit.Repl206;
import java.util.HashMap;
/*# Hash Map
Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"
"FOUR"
Using entry set print key and values pairs using loop
**Expected Output:**
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC*/
import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

import static javafx.scene.input.KeyCode.*;

class Maina {
    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();
        myMap.put("ONE", "AAA");
        myMap.put("TWO", "BBB");
        myMap.put("THREE", "CCC");
        myMap.put("FOUR", "DDD");
        myMap.put("FIVE", "EEE");
        System.out.println("HASHMap Before Remove :");
        myMap.forEach((X,Y)-> System.out.println(X+" : "+Y));
        System.out.println("--------------");
        myMap.remove("ONE");
        myMap.remove("FOUR");
        System.out.println("HASHMap After Remove: ");
        myMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}