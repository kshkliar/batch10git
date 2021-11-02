package replit;

/*
Create a variable that will hold the count of all instance of the Main class

Create 3 Object of the class and print value of the count variable;
Expected Output:
3
 */

public class Task126 {
    static int count;

    public static void main(String[] args) {
        Task126 m =new Task126();
        count++;
        Task126 x= new Task126();
        count++;
        Task126 v = new Task126();
        count++;
        System.out.println(count);
    }
}
