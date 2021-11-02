package replit;

import java.util.Scanner;

/*Write a program that creates a String array with size 7.
Ask the user to input Days of week beggining with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array
Example:

 */
public class Task076 {
    public static void main(String[] args) {
        String []array =new String [7];// создаем массив
        Scanner scan =new Scanner(System.in);//создаем сканер
        for (int i=0; i<=array.length-1; i++) {// проходимся по массиву
            System.out.println("Please enter day " + (i + 1) + " of the week");//нужно прибавить единицу что бы
            //вывести 7 дней
            array[i] = scan.nextLine();// записываем введенные значени
        }
        for (int i=0; i<array.length;i++){  //проходимся для того что бы вывести на консоль
            System.out.println(array[i]);// выводим на консолль
        }
    }
}
