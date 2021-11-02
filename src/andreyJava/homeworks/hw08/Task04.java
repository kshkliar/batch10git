package andreyJava.homeworks.hw08;

/*Дано слово, состоящее из четного числа букв. Вывести на экран его первую половину, не используя оператор цикла.*/
public class Task04 {

    public static void main(String[] args) {
        int half;
        String str1 = "Java";
        half = str1.length() / 2;
        String str1Part1 = str1.substring(0, half);
        System.out.println(str1Part1);


    }
}