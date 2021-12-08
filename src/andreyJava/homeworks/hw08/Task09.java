package andreyJava.homeworks.hw08;

public class Task09 {

    public static void main(String args[]) {

        String a = "Hello word";
        a = a.replace("H", "");
        System.out.println(a);

        System.out.println("----Another way-------");

        String str = "Java";
        System.out.println(removeCharAt(str));
    }

    public static String removeCharAt(String s) {
        return s.substring(1);
    }//возвращает подстроку строки с индексом символа
}

