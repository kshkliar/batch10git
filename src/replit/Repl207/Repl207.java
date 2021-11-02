package replit.Repl207;
/*Create Hash Map.
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using EntrySet print the key and values pairs using iterator only
replace with below key THREE--> ASEL and key FIVE-->SUMAIR
Using EntrySet print the key and values pairs using iterator only
OUTPUT
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL*/
import java.util.*;
import java.util.Map.Entry;

class Main {
    public static void main(String[] args) {
        Map<String,String> myMap=new HashMap<>();
        myMap.put("ONE","AAA");
        myMap.put("TWO","BBB");
        myMap.put("THREE","CCC");
        myMap.put("FOUR","DDD");
        myMap.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");
        Iterator<Entry<String,String>> iterator=myMap.entrySet().iterator();
        while (iterator.hasNext()){
            Entry<String,String>it=iterator.next();
            System.out.println(it.getKey()+" : "+it.getValue());
        }
        System.out.println("------------------");
        myMap.replace("THREE",  "ASEL");
        myMap.replace("FIVE", "SUMAIR");
        System.out.println("HashMap After Replace :");
        myMap.forEach((X,Y)-> System.out.println(X+" : "+Y));
    }
}