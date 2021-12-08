package replit.repl165;

class Childa extends Parent{


    public void publicMethod() {
        System.out.println("I am child public method");
    }

    protected void protectedMthod() {
        System.out.println("I am child protected method");

    }

    void defaultMethod() {
        System.out.println("I am child default method");

    }

    private void privateMethod() {
        System.out.println("I am private child method");
    }

}