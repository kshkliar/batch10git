package replit;

/* Create a method that will accept a String as a parameter and return new String all in upper case;
Call method
Expected Output:
TEST

 */
public class Task115 {
    public static void main(String[] args) {
        System.out.println(newUpperCaseString("test"));

    }

    private static String newUpperCaseString(String newS) {// accept String as a parament
// инкапсулировали стринг(теперь не нуждаеться в сознании Объекта
        return newS.toUpperCase();// return new String in upper case
    }
}
//Второй способ:
/* Task115a string=new Task115a();
        System.out.println(string.stringToUppercase("test"));

    }
    String stringToUppercase(String a) {
        return a.toUpperCase();
    }*/