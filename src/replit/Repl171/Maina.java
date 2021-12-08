package replit.Repl171;

class Maina extends Parenta {

    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    public void m1(String myString) {
        System.out.println(myString);
    }

    public static void main(String[] args) {
        Maina obj=new Maina();
        obj.m1();
        obj.m1("m1 method with parameter");
    }
}

