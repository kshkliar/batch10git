package replit;
/*Write a program that creates an array of strings with the following values
 {"This", "is", "array","of", "string"} and
print all values in one line
**Output**
This is array of strings

 */
public class Task073a {

    public static void main(String[] args) {



       String[]array={"This","is","array","of","string"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }

    }
}