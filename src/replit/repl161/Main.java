package repl161;

class Main {
    private void m1() {
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

