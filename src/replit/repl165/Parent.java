package replit.repl165;
/*Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".
Override methods in child class
In Main Class create object of the child class and see which methods are available
**Expected Output:**
I am a child public method
I am a child protected method
I am a child default method*/
class Parent{
    public void PublicMethod(){
        System.out.println("I am a Parent public method");
    }
    protected void ProtectedMethod(){
        System.out.println("I am a Parent protected method");
    }
    void DefaultMethod(){
        System.out.println("I am a Parent default method");
    }
    private void PrivateMethod(){
        System.out.println("I am a Parent private method");
    }
}