package replit.Repl213;
/*Create a method that will do temperature check. Anytime user passes temperture that is below 32 method should
throw an Exception saying "It is freezing"
In Main method call the method and handle an Exception
**Expected Output:**

Instructions
this file should contain student lesson instructions
students will see these instructions in a read-only workspace tab
Steps
Use Markdown to format your instructions.
For example, here is a code block in java10_beta
public class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
  }
}
public class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
  }
}
Include an image by placing it in the assets folder.

For example, here is the Replit logo:


java.lang.RuntimeException: It is freezing*/
class Main {
    public static void main(String[] args) {
        int temperature = 30;
        if (temperature < 32) {
            System.out.println(new RuntimeException("It is freezing"));
        }
    }

}