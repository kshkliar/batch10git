package replit;
/* Create a String given ="I love Java classes at Syntax"
Retrieve 2 Strings from given String and print them
Expected Output:

classes at Syntax
I love Java

 */

public class Task094 {
    public static void main(String[] args) {
        String given ="I love Java classes at Syntax";
        System.out.println(given.substring(0,13));
        System.out.println(given.substring(0,11));
    }
}
