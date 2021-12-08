package replit.repl160;
/*For you to do:
Overload instance method display by having different types of parameters
Inside each method write the logic to print value of the parameter
Call all methods inside your main method
**Expected Output:**
100
Syntax Technologies
100.09*/
class Maina {
    static void display (int num) {
        System.out.println(num);
    }

    static void display(String name) {
        System.out.println(name);
    }

    static void display(double num2) {
        System.out.println(num2);

    }

    public static void main(String[] args) {
        display(100);
        display("Syntax Technologies");
        display(100.09);
    }
}

