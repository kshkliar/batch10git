package replit.Repl174a.Repl174;

class Main implements MyInterface {

    @Override
    public void method1() {
        System.out.println("Implementation of method 1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation of method 2");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.method1();
        obj.method2();
    }
}