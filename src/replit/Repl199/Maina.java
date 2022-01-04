package replit.Repl199;
/*Create a Set collection in which you want to preserve an order of
inserted String Objects.
Add the below values
- null
- Sohil
- Diego
- Alijon
- Asel
- Sumair
Print values 1 by 1 using loop and Iterator
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair*/

import java.util.Iterator;
import java.util.LinkedHashSet;

class Maina {
    public static void main(String[] args) {
        LinkedHashSet<String> mySet = new LinkedHashSet<>();
        mySet.add("null");
        mySet.add("Sohil");
        mySet.add("Diego");
        mySet.add("Alijon");
        mySet.add("Asel");
        mySet.add("Sumair");
        for (String element : mySet) {
            System.out.println(element);

        }
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

