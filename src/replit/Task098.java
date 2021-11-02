package replit;
/*
Create a  String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
Expected Output:
Welcome Sentax family
 */



public class Task098 {
    public static void main(String[] args) {
        String given = "Hello Syntax friends";
        String newString = given.replace("Hello", "Welcome");
        String newString2 = newString.replace("friends", "family");
        System.out.println(newString2);
    }
}