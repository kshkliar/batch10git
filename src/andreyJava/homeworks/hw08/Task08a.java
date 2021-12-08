package andreyJava.homeworks.hw08;

/*Дан массив строк, содержащий текст, заканчивающийся точкой.
Вывести на экран слова, содержащие три буквы .*/
public class Task08a {

    public static void main(String[] args) {
        String text = "value=value-1, Hello count=count+1, bob";

        String[] words = text.split(" ");// получаем массив слов

        for (String word : words) {// идем по масиву слов и проверяем если длина слова = 3 то выводим его в консоль
            if (word.length() == 3) {
                System.out.println(word);
            }
        }
    }
}
