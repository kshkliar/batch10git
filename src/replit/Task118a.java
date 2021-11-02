package replit;

/* Write a method on line two with the following specs:
Returns:
a String:
a String
Name:
spaceOut
Parameters:
a String
Then complete the method by programming the following behavior
Insert spaces after every character in the String s, then return the new string.
See below examples (note the space at the end as well).
Examples:
spaceOut("hello")==>" h e l l o "
spaceOut("technology")==> t e c n o l o g y
 */


public class Task118a {

    public static String spaceOut(String a) {
        for (int i = 0; i < a.length(); i++) {

        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(spaceOut("hello").replace(""," "));
        System.out.println();
        System.out.println(spaceOut("technology").replace(""," "));
        System.out.println(spaceOut("technology").replace(""," "));
    }


}