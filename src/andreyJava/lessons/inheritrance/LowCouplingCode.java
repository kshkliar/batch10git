package andreyJava.lessons.inheritrance;

public class LowCouplingCode {
    public static void main(String[] args) {
        One one = new One();
        Two two = new Two();

        new NewCode(two);
    }
}

class Code {
    private One one;

    public Code(One one) {
        this.one = one;
    }

    public void action() {
        one.print();
    }
}


class NewCode {
    private Printable printable;

    public NewCode(Printable printable) {
        this.printable = printable;
    }

    public void action() {
        printable.print();
    }
}

interface Printable {
    void print();
}

class One implements Printable {
    public void print() {
        System.out.println("One");
    }
}

class Two implements Printable {
    public void print() {
        System.out.println("Two");
    }
}
