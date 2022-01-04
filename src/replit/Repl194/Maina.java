package replit.Repl194;
/***For you to do:**
 Create a method that will remove an element based on the specified condition
 from given List and return new List;
 **Expected Output:**
 [USA, Kazakhstan, Pakistan, Russia]*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Maina {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");

        Iterator<String>iterator=countries.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("R")) {
                iterator.remove();
            }
        }
        System.out.println(countries);
    }
}
