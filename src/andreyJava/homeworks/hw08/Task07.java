package andreyJava.homeworks.hw08;

/*Дана строка.Указать те слова, которые содержат хотя бы одну букву k.

 *** В строке между словами вставить вместо пробела запятую и пробел.*/
public class Task07 {

//сделать самостоятельно
    public static void main(String[] args) {
        String st1 = "Hello my young friend";

        String[] words = st1.split(" ");
      //  System.out.println(words);
        for (String word : words) {

            if (word.contains("o")) {
                System.out.println(word);
            }
        }
        String st2 = "Hello my young friend#2";


       st2=st2.replaceAll(" ",", ");// если не записал переменную метод реплейс алл тгнорируеться.
        System.out.println(st2);
    }
}
