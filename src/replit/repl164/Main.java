package repl164;

class Main {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        Child3 obj3 = new Child3();

        Parent[] objectArr = {obj1, obj2, obj3};
        for (Parent i : objectArr) {
            i.hello();
        }
    }
}

class Parent {
    void hello() {
        System.out.println("method in Parent class");
    }
}

class Child1 extends Parent {
    void hello() {
        System.out.println("method in Child1 class");
    }
}

class Child2 extends Child1 {
    void hello() {
        System.out.println("method in Child2 class");
    }
}

class Child3 extends Child2 {
    void hello() {
        System.out.println("method in Child3 class");
    }
}

