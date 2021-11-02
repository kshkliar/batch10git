package andreyJava.homeworks.hw08;

/*Declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat”
   for second.
   Write code to display all of the letters, which are present in the first word, but absent in the second.*/
public class Task02 {

    public static void main(String[] args) {

        String myStr1 = "Cartoon".toLowerCase();
        String mySTr2 = "Tomcat".toLowerCase();

        for (int i = 0; i < myStr1.length(); i++) {
            char symbol = myStr1.charAt(i);

            if (!mySTr2.contains(String.valueOf(symbol))) {
                System.out.println(symbol);
            }
        }
    }
}
