package replit.Repl212;
/*Create a method that will not be handling exception and throwing it at caller.
In main method call method and handle the exception.
**Expected Output:**
java.io.FileNotFoundException:  (No such file or directory)

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


*/

import java.io.*;
class Main {
    private static final String filename = "";
    public static void main(String[] args) {
        BufferedReader rd = null;
        try {
            rd = new BufferedReader(new FileReader(new File(filename)));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
