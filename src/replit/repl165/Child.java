package repl165;

class Child extends Parent{
    public void PublicMethod(){
        System.out.println("I am a child public method");
    }
    protected void ProtectedMethod(){
        System.out.println("I am a child protected method");
    }
    void DefaultMethod(){
        System.out.println("I am a child default method");
    }
    private void Private_Method(){
        System.out.println("I am a child private method");
    }
}