package replit.repl161;
/*Overload private instance method m1
Call each method from the main method.
Expected Output:
private m1 method
private m1 method with int parameter*/
class Main {
    private void m1()//если не статика то он инстанс метод
    {
        System.out.println("private m1 method ");
    }

    private void m1(int i) {
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.m1();
        obj.m1(9);
    }
}

