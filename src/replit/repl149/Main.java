package repl149;

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
