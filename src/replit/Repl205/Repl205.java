package replit.Repl205;
/*Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
**Expected Output:**
265
22180
PATRICK ST
UNITED STATE
VIENNA*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Map<String,String> myMap=new HashMap<>();
        myMap.put("Street" , "Patrick ST" );
        myMap.put("Suite" , "265");
        myMap.put("City" , "Vienna");
        myMap.put("Zip" , "22180");
        myMap.put("Country" , "United State");
// Advance for
    for (Map.Entry<String,String> entry: myMap.entrySet()){
        System.out.println(entry.getValue().toUpperCase(Locale.ROOT));
   }
    // myMap.forEach((key, value) -> System.out.println(value.toUpperCase(Locale.ROOT)));

    }
}