package replit.repl162;

/*Overload static method and then execute both overloaded methods.
**Expected Output:**
static method without parameter
static method with int parameter*/
class Maina {

    static void display() {
        System.out.println("Static method without parameter");

    }

    static void display(int num) {
        System.out.println("Static method with int parameter");
    }

    public static void main(String[] args) {
        display();
        display(8);
    }
}

