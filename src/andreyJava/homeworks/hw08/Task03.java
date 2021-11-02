package andreyJava.homeworks.hw08;

/*Вывести текст, составленный из последних букв всех слов.*/
public class Task03 {


    public static void main(String[] args) {
        String text = "Some text about some text";
        StringBuilder result = new StringBuilder();

        String[] words = text.split("\\s+");
        for (String word : words)
//            result.append(word.toCharArray()[word.length() - 1]);
            System.out.println(word.toCharArray()[word.length() - 1]);

        System.out.println("String: " + text);
        System.out.println("Result: " + result.toString());
    }


}
