package replit;

/* Declare 3 instance variables to hold an integer, double and char values.
Create 2 instances(экземпляра) of the class and assign  values to variables and the print them
Expected Output:
10
10.23
a
100
100.23
s
 */
public class Task121 {
    int number;
    double num;
    private char character;

    public static void main(String[] args) {//создаем экземпляр класса:
        Task121 m = new Task121();// получаем доступ через обьект класса
        m.number = 10;
        m.num = 10.23;
        m.character = 'a';
        System.out.println(m.number);
        System.out.println(m.num);
        System.out.println(m.character);

        Task121 x = new Task121();

        x.number = 100;
        x.num = 100.23;
        x.character = 's';

        System.out.println(x.number);
        System.out.println(x.num);
        System.out.println(x.character);


    }
}
