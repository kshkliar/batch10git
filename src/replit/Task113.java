package replit;

/* Step1: Create a method that will accept with 2 parameters of integer type
Step2: Write the logic in that method in println statement to print hours and minutes
Step3: Call the method
Expected Output:
11:30
 */
public class Task113 {
    public static void main(String[] args) {
        Task113 time = new Task113();
        time.numbers(11, 30);

    }

    void numbers(int hours, int minutes) {
        System.out.println(hours + ":");
    }
}
