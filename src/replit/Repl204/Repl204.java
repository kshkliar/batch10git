package replit.Repl204;
/*Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
**Expected output:**
Patrick ST
265
Vienna
22180
United State*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Map<String, String> myMap = new LinkedHashMap<>();
        myMap.put("Street", "Patrick ST");
        myMap.put("Suite", "265");
        myMap.put("City", "Vienna");
        myMap.put("Zip", "22180");
        myMap.put("Country", "United State");
        Iterator<Map.Entry<String,String>>iterator = myMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,String>entry=iterator.next();
            System.out.println(entry.getValue());
        }
    }
}