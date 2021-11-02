package replit;
/* Declare a static variable that will hold integer value;
Access number from the main method and assign value to it.

Create an Object of the class , access number in a nonstatic way and assign value of 200
Print out number using class name and using instance
Expected output:
200
200
 */
public class Task125a {
 static int num;

    public static void main(String[] args) {
        num=200;
        System.out.println(num);

        Task125a x=new Task125a();
        num=200;
        System.out.println(Task125a.num);
        System.out.println(x.num);
    }


}
