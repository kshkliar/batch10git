package replit;

/* Create a method that will accept a String as a parameter and return new String
all in upper case;
Call method
Expected Output:
TEST

 */
public class Task115a {
    public static void main(String[] args) {

        System.out.println(newStringToUpperCase("test"));
    }

    private static String newStringToUpperCase(String a) {
        return a.toUpperCase();
    }
    }