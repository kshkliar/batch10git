package replit.Repl171;

/*# Abstraction
Create a Parent Class that will have two overloaded abstract methods m1
Make Main class as concrete subclass to Parent Class
In main method call the methods.
**Expected Output:**
m1 without parameters
m1 method with parameter*/
abstract class Parenta {

    abstract void m1();
    public abstract void m1(String myString);
}

