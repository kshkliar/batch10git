package replit.Repl194;
/***For you to do:**
 Create a method that will remove an element based on the specified condition
 from given List and return new List;
 **Expected Output:**
 [USA, Kazakhstan, Pakistan, Russia]*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        //countries.removeIf(x-> x.startsWith("A")); using lambdas
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }

        System.out.print(countries);
    }
}
