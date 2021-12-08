package replit.Repl172;

class Maina extends Parenta {

    public void m1() {
        System.out.println("m1 without parameters");
    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.m1();
        obj.m2("m1 method with parameter");
    }
}