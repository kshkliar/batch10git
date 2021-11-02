package andreyJava.homeworks.hw08;

/*Дан массив строк, содержащий текст, заканчивающийся точкой.
Вывести на экран слова, содержащие три буквы .

   *** Преобразовать данный текст, заменив каждую строку вида переменная=переменная+1;
   на строку вида переменная++;
   * а каждую строку вида
   переменная=переменная–1;на строку вида переменная–– */
public class Task08 {

    public static void main(String[] args) {
        String text = "value=value-1, Hello count=count+1, bob";

        String sentence = text
                .replaceAll("value=value-1", "value--")
                .replaceAll("count=count\\+1", "count++");

        System.out.println(sentence);
    }
}
