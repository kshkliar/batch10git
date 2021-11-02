package repl154;


class Main {
    public static void main(String[] args) {
        new Child();
        new Child(10);
    }
}

class Parent {
    Parent() {
        System.out.println("Parent Constructor without argument");
    }

    Parent(int number) {
        System.out.println(number);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor without argument");
    }

    Child(int num) {
        super(num);
    }
}

