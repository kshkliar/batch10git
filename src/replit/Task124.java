package replit;
/* Declare static variable in class level as below and assign its value:
String ss="Welcome to Syntax Technologies"
Access variable in the main method and print it using three ways you learned so far
Hint:
first way:by calling directly
Second way: By using className
Third way: By creating the object of the class
Expected output:
Welcome to Syntax Technologies
Welcome to Syntax Technologies
Welcome to Syntax Technologies
 */
public class Task124 {
    static String ss= "Welcome to Syntax Technologies";

    public static void main(String[] args) {
        //first way-calling directly -вызов напрямую
        System.out.println(ss);
        //second way-By using className -вызов через название класса
        System.out.println(Task124.ss);
        //third way -By creating the object of the class-через создание обьекта класа;
        Task124 m =new Task124();//вызов через объект класса;
        System.out.println(m.ss);
    }

}
