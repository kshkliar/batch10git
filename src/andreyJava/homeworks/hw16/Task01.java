package andreyJava.homeworks.hw16;

import java.util.regex.Pattern;

/*1) Любое количество букв,
а потом две цифры и наоборот.

2) 2-4 цифры, а
потом 2-4 буквы и наоборот.
//составить такие регулярные выражения

3) Пользователь вводит имя и фамилию.
 Буквы могут быть в разных регистрах.
Проверить, чтобы первые буквы были в верхнем регистре,
 а остальные буквы - в нижнем.*/
//Нужно задать шаблон ( с целью найти патерн -строку ему соответствующий - проверить соответствие)
public class Task01 {

    public static void main(String[] args) {

        //Как * правильно экранировать в Java  -пробел  , также можно ли без ковычек использовать regex ( вне стринга)

// 1.)Любое количество букв а потом две цифры и наоборот.
        String text = "Hello44"; //образец
        String pattern = "[a-zA-Z]*[0-9]{2}";

        String text2 = "44Hello";
        String pattern2 = "\\d{2}[a-zA-Z]*";

        //проверка на соответствие:
        boolean isEqual = Pattern.matches(pattern, text);//один шаблон другой сам текст -сюда переданные строки выше указанныеSystem.out.println(isEqual);
        System.out.println(isEqual);

        boolean isEqual2 = Pattern.matches(pattern2, text2);
        System.out.println(isEqual2);

// 2-4 цифры, а потом 2-4 буквы и наоборот.

        String text3 = "44Hell";
        String pattern3 = "[0-9]{2,4}[a-zA-Z]{2,4}";

        boolean isEqual3 = Pattern.matches(pattern3, text3);
        System.out.println(isEqual3);

        String text4 = "Hell44";
        String pattern4 = "[a-zA-Z]{2,4}\\d{2,4}";

        boolean isEqual4 = Pattern.matches(pattern4, text4);
        System.out.println(isEqual4);

/*Пользователь вводит имя и фамилию. Буквы могут быть в разных регистрах.
Проверить, чтобы первые буквы были в верхнем регистре, а остальные буквы - в нижнем*/

        String text5 = "Elon Mask"; // на regex101 отработало а здесь работает и с маленькими первыми буквами
        String pattern5 = "[A-Z][a-z]+\\s[A-Z][a-z]+";

        boolean isEqual5 = Pattern.matches(pattern5, text5);
        System.out.println(isEqual5);
    }
}
