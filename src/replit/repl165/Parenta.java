package replit.repl165;
/*Parent class create 4 methods with different level of access modifiers.
In each method print "I am parent public/protected/default/private method".
Override methods in child class
In Main Class create object of the child class and see which methods are available
**Expected Output:**
I am a child public method
I am a child protected method
I am a child default method*/
class Parenta {
    public void publicMethod() {
        System.out.println("I am parent public method");

    }

    protected void protectedMethod() {
        System.out.println("I am protected method");

    }

    void defaultMethod() {
        System.out.println("I am child default method");
    }

    private void privatreMethod() {
        System.out.println("I am child private method");
    }


}