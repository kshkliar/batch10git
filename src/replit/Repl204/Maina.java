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

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class Maina {
    public static void main(String[] args) {
        Map<String, String> myMap = new LinkedHashMap<>();
        myMap.put("Street", "Patrick ST");
        myMap.put("Suite", "265");
        myMap.put("City", "Vienna");
        myMap.put("Zip", "22180");
        myMap.put("Country", "United Stetes");

        Iterator<Map.Entry<String, String>> iteratar = myMap.entrySet().iterator();
        while (iteratar.hasNext()) {
            Map.Entry<String, String> entry = iteratar.next();
            System.out.println(entry.getValue());
        }

    }
}