package replit.Repl176a;

/*# Interfaces
# ***Follow steps carefully
Step 1: Create Parent Interface as ParentInterface that will have undefined
 method parentMethod without parameters.
Step 2: Create an Interface as ChildInterface that will be a child interface
of Parent Interface and will have a method childMethod without parameters.
Step 3: Inherit the Main class to Child Interface.
Step 4: Execute both methods
**Expected Output:**
Parent Method-welcome to Syntax
Child Method-hello Syntax*/
interface ParentInterface {
    public void parentMethod();
}

interface ChildInterface extends ParentInterface {
    public void childMethod();

}

//Inherit the Main class to Child Interface.
class Main implements ChildInterface {


    @Override
    public void parentMethod() {
        System.out.println("Parent method -welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child method-hello Syntax");
    }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.parentMethod();
        obj.childMethod();
    }
}