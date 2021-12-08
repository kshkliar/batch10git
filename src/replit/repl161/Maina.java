package replit.repl161;

/*Overload private instance method m1
Call each method from the main method.
Expected Output:
private m1 method
private m1 method with int parameter*/
class Maina {
    private void m1() {// instance method
        System.out.println("Privat m1 method");
    }

    private void m1(int i) {
        System.out.println("Private m1 method with int parameter");
    }

    public static void main(String[] args) {
        Maina obj = new Maina();
        obj.m1();
        obj.m1(1);
    }
}



