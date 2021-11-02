package repl165;

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