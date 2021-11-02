package replit;
/* Declare a static variable that will hold integer value;
Access number from the main method and assign value to it.
Create an Object of the class , access number in a nonstatic way and assign value of 200
Print out number using class name and using instance
Expected output:
200
200
 */
public class Task125 {
    static int number;

    public static void main(String[] args) {
        number =200;
        System.out.println(number);

        Task125 m = new Task125();
        m.number=200;
        System.out.println(m.number);
    }
}
