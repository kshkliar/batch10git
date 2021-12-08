package replit.Repl171;
/*# Abstraction
Create a Parent Class that will have two overloaded abstract methods m1
Make Main class as concrete subclass to Parent Class
In main method call the methods.
**Expected Output:**
m1 without parameters
m1 method with parameter*/
abstract class Parent{
    abstract void m1();
    public abstract void m1(String myString);
}

class Main extends Parent {
    public void m1(){
        System.out.println("m1 without parameters");
    }
    public void m1(String myString){
        System.out.println(myString);
    }

    public static void main(String[] args){
        Main obj=new Main();
        obj.m1();
        obj.m1("m1 method with parameter");
    }
}

