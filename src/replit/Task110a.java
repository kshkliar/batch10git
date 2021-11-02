package replit;

/*
Create a method name as newLine that should have print statement inside the
 method body as
"newLine method implementation"
Create a method name as displayLine that should have print statement inside the method body
as "displayLine method implementation"
Call both methods
Expected Output:
newLine method implementation
displayLine method implementation
 */

public class Task110a {
    public static void main(String[] args) {
        Task110a m = new Task110a();
        m.newLine();
        m.displayLine();
    }

    void newLine() {
        System.out.println("newLine method implimantation");
    }

    void displayLine() {
        System.out.println("displayLine method implementation");
    }
}