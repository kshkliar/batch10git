package repl156;

class Main {
    public static void main(String[] args) {
        B obj = new B();
       obj.display();

    }
}

class A {
    int i=10;



}

class B extends A {
    int i=20;

    public void display() {
        System.out.println(this.i);
        System.out.println(super.i);
    }

}



