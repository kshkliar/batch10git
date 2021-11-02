package repl162;

class Main {
    static void display() {
        System.out.println("static method without parameter");
    }

    static void display(int myInt) {
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        display();
        display(0);
    }
}

