package andreyJava.homeworks.hw17;
/*1) В строке содержутся слова и числа. Необходмо выделить числа и посчитать их сумму.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//использовать matcher
public class Task01 {

    //String text2 = "44Hello";
    //  String pattern2 = "\\d{2}[a-zA-Z]*";

    //проверка на соответствие:
    // boolean isEqual = Pattern.matches(pattern, text);//один шаблон другой сам текст -сюда переданные строки выше указанныеSystem.out.println(isEqual);
    //    System.out.println(isEqual);
    //  boolean isEqual = Pattern.matches(pattern, text);//один шаблон другой сам текст -сюда переданные строки выше указанныеSystem.out.println(isEqual);
    ///    System.out.println(isEqual);

    public static void main(String[] args) {


        String str = "Hello 192";
//        if (str.matches(".*")) {
//            int count = 0, sum = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (Character.isDigit(str.charAt(i))) {
//                    count++;
//                    sum += Integer.parseInt(String.valueOf(str.charAt(i)));
//                }
//            }
//            System.out.println("String contains " + count + " digits, the sum is = " + sum);
//        }

        String regex = "\\d";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(str);

        int sum = 0;

        while (matcher.find()) {
            int value = Integer.parseInt(matcher.group());

            sum += value;
        }

        System.out.println(sum);
    }
}