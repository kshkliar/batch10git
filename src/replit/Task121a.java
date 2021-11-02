package replit;

/* Declare 3 instance variables to hold an integer, double and char values.
Create 2 instances (экземпляра) of the class and assign  values to variables
and the print them
Expected Output:
10
10.23
a
100
100.23
s
 */
public class Task121a {
    int a;                //инициализируем поля
    double b;
    char character;


    public static void main(String[] args) {//создаем главный метод
        Task121a m = new Task121a();     //создаем экземпляр класса;
        m.a=10;  //присваеваем значения полям
        m.b=10.23;
        m.character='a';

        System.out.println(m.a);//обращаеться не к обьекту , а обьект обратился к классу
        System.out.println(m.b); //выводим значения
        System.out.println(m.character);
        //повторяем действия с дуругим классом
        Task121a x=new Task121a();
        x.a=100;
        x.b=100.23;
        x.character='s';
        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println(x.character);
    }










}
