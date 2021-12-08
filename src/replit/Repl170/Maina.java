package replit.Repl170;
/*For you to do:
Overload 2 final instance methods:
Call them in main method
**Expected Output:**
Final method with boolean parameter
Final method with String parameter*/
class Maina {

    final void display(boolean myBoolean) {
        System.out.println("Final method with boolean parameter");
    }

    final void display(String myString) {
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {
        Maina m=new Maina();
        m.display(true);
        m.display("Final method with String parameter");
    }
    }