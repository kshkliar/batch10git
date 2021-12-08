package andreyJava.lessons.regex;

import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
        /*String text = "Hello";
        String pattern = "H.llo";//. any symbol*///проверяем соответсвует или текст шаблону -паттерну.

//       String text = "Hillo";
//        String pattern = "H[e,a]llo";//e or a symbols

//       String text = "Hwllo";
//        String pattern = "H[a-k]llo";//from a to k symbols

//       String text = "HAllo";
//        String pattern = "H[A-Ka-k0-9]llo";//from a to k symbols, from A to K symbols, from 0 to 9

//        String text = "HAllo";
//        String pattern = "H\\dllo";//short from 0 to 9

//        String text = "H4 Bllo";
//        String pattern = "H[0-9]\\s[A-D]llo";

//        Quantors


//        String text = "H49llo";
//        String pattern = "H[0-9]{2}llo";//must be 2 digits

//        String text = "H497llo";
//        String pattern = "H[0-9]{2,4}llo";//from 2 to 4 digits
//
//        String text = "H497llo";
//        String pattern = "H[0-9]*llo";//any count digits
//
//        String text = "H497llo";
//        String pattern = "H[0-9]+llo";//from 1 and more

        String text = "H497llo";
        String pattern = "H[0-9]?llo";//from 1 and more

        boolean isEqual = Pattern.matches(pattern, text);//один шаблон другой сам текст -сюда переданные строки выше указанные
        System.out.println(isEqual);
    }
}
