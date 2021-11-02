package replit;
import java.util.Locale;
import java.util.Scanner;
/*Write code that will take in a String input and check to see if it is a palindrome or not.
A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**
Examples of palindromes:
- racecar
- was it a car or a cat I saw
- never odd or even
- rats live on no evil star
Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.

Your program will print out "true" if it's a palindrome and "false" if not.*/
public class Task099a {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);//сканнер
        System.out.println("In:");//вопрос
        String givenString = inp.nextLine();//получение строки
        String replaceAllString=givenString.replaceAll("\\s","").toLowerCase();
//убрали шрифт и пробел
        System.out.println(replaceAllString);
        System.out.println("-------------------");
        boolean result=false;

        int i=0;
        int j=replaceAllString.length()-1;
        while (i <= j) {
            if (replaceAllString.charAt(i) == replaceAllString.charAt(j)) {
                result=true;
            }else{
                break;
            }
            i++;
            j--;
        }
        System.out.println(result);
        }

    }

