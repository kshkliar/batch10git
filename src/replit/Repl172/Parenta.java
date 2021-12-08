package replit.Repl172;

/*# Abstraction
Create a Parent Class in which you will have 1 implemented method m2 and 1
unimplemented method m1
Make Main class to be a derived class from Parent.
In main method execute both methods
**Expected Output:**
Child class providing implementation
Parent class providing implementation*/
abstract class Parenta {

    abstract void m1();

    public void m2(String myString) {
        System.out.println(myString);
    }
}

