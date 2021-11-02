package replit;
/*
Instantiate and StringBuffet class
Append Value "Hello" to it
Append value "Word" to it.
Print in Uppercase.
Expected Output:
Hello Word

 */
public class Task106a {
    public static void main(String[] args) {




StringBuffer str=new StringBuffer();
        str.append("Hello");
        str.append(" Word");
        String appendWord = str.toString().toUpperCase();
        System.out.println(appendWord);
    }

}
