package replit;

/*
Create one method as syntax Technologies and write the logic for that method
in println statement as "Welcome to Syntax Technologies!"

Create another method as syntaxStudents and write the logic for that method
in println statement as
"Welcome Syntax Students!"

Call both methods
Expected Output:
Welcome to Syntax Technologies!
Welcome Syntax Students!
 */
public class Task111a {
    public static void main(String[] args) {

        Task111a object1 = new Task111a(); // создали объект

        object1.syntaxTechnologies();
        object1.syntaxStudents12();


    }

    void syntaxTechnologies() {
        System.out.println("Welcome to Syntax Technologies!");

    }

    void syntaxStudents12() {
        System.out.println("Welcome Syntax Student!");
    }

}