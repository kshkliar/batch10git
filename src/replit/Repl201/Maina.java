package replit.Repl201;
/*Create a Map in which you do not need to preserve the order of the entries
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Find how many entries are inside the map
Remove all entires from the Map
Find the Map size again
**Expected Output:**
5
0*/

import java.util.HashMap;
import java.util.Map;

class Maina {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("Street", "Patrick St");
        myMap.put("Suite", "265");
        myMap.put("City", "Vienna");
        myMap.put("Zip", "221180");
        myMap.put("Country", "United States");
        System.out.println(myMap.size());
        myMap.clear();
        System.out.println(myMap.size());
    }
}

