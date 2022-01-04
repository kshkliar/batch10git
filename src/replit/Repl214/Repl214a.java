package replit.Repl214;
/*Create a custom Exception class
In main class create a method that will check students grade
if students grade is >90 then below exception should be thrown
if students grade is below 90 print "You are a great student"
In main method calls method gradeCheck and handle an Exception
**Expected Output:**
SyntaxStudentException: You are an exceptionally awesome student

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


```*/
class Maina {
    public static void main(String[] args) {
        int grade = 91;
        if (grade > 90) {
            System.out.println(new SyntaxStudentException("You are an exceptionally awesome student"));
        } else {
            System.out.println(new SyntaxStudentException("You are a great student"));
        }
    }
}

class SyntaxStudentExceptiona extends RuntimeException {
    SyntaxStudentExceptiona(String errorMessage) {
        super(errorMessage);
    }
}