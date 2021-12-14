package andreyJava.lessons.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
        /*String text = "Hello";
        String pattern = "H.llo";//. any symbol*///проверяем соответсвует или текст шаблону -паттерну.

//       String text = "Hillo";
//        String pattern = "H[e,a]llo";//e or a symbols

//       String text = "Hwllo";
//        String pattern = "H[a-k]llo";//from a to k symbols

      /* String text = "HAllo";
        String pattern = "H[A-Ka-k0-9]llo";//from a to k symbols, from A to K symbols, from 0 to 9*/

//        String text = "Hbllo";
//        String pattern = "H[A-Ka-k0-9&&[^Bb]]llo";//from a to k symbols, from A to K symbols, from 0 to 9, exclude B and b



  //  String text = "World dry hello";//оператор or  или
  // String pattern = ".*(run|dry).*";//from a to k symbols, from A to K symbols, from 0 to 9, exclude B and b



    //    String text = "Worlddry  ";
   //     String pattern = "[a-zA-Z0-9]{1,10}\\s{0,10}";

    //    String text = "Worlddry    Worlddry";
   //     String pattern = "([a-zA-Z0-9]){1,10}([\\s]){0,10} ([a-zA-Z0-9]){1,10}";
        String text = "Wokot5678";
           String pattern = "([a-zA-Z0-9&&[^fer]]){1,10}";// отрицание один из f e или r не должно быть

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

  /*      String text = "H497llo";
        String pattern = "H[0-9]?llo";//from 1 and more*/

        boolean isEqual = Pattern.matches(pattern, text);//один шаблон другой сам текст -сюда переданные строки выше указанные
        System.out.println(isEqual);
    }
}

class UseMatcher {
    public static void main(String[] args) {
        String text = "1word2word3";
        String text1 = "1word2word3";
        String regex = "word";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);
        Matcher matcher1 = pattern.matcher(text1);

        /*System.out.println(matcher.matches());
        System.out.println(matcher1.matches());*/

        while (matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(matcher.group());
            System.out.println(matcher.end());

        }

    }
}
