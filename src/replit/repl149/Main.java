package replit.repl149;
/*1. Create Three classes (Main, A, B):
Have a method that prints out the following
For A:  "Class A"
For B:  "Class B"
Make B extend A
From your Main class create an object of the B class and call the methods.
Output:
Class A
Class B*/
class Main {
    public static void main(String[] args) {
        B obj = new B();
    }
}

class A{
    A(){
        System.out.println("Class A");
    }
}
class B extends A{
    B(){
        System.out.println("Class B");
    }
}
