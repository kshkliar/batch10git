package replit;
/*
Instantiate and StringBuffet class
Append Value "Hello" to it
Append value "Word" to it.
Print in Uppercase.
Expected Output:
Hello Word

 */
public class Task106 {
    public static void main(String[] args) {
        StringBuffer str =new StringBuffer();//создали объекст

        str.append("Hello");// первая часть строки-метод
        str.append(" Word");//вторая часть строки- метод

        String appendWord = str.toString();// соединяем
        System.out.println(appendWord);
    }

}
