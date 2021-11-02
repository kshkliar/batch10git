package replit;
/*
Create one method as syntax Technologies and write the logic for that method
in println statement as "Welcome to Syntax Technologies!"
Create another method as syntaxStudents and write the logic for that method in println statement as
"Welcome Syntax Students!"
Call both methods
Expected Output:
Welcome to Syntax Technologies!
Welcome Syntax Students!
 */
public class Task111 {
    public static void main(String[] args) {

        Task111 m =new Task111();
        m.syntaxTechnologies();
        m.syntaxStudents();

    }
    void syntaxTechnologies(){
        System.out.println("Welcome to Syntax Technologies!");

    }
    void syntaxStudents(){
        System.out.println("Welcome Syntax Students!");
    }
}
