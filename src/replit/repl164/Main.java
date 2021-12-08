package replit.repl164;
/*Create a method hello() in parent class that will print "method in Parent class" then override  that method
is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"
In Main Class create 3 object of the child classes and store in
into an array and call method hello():
**Expected Output:**

method in Child1 class
method in Child2 class
method in Child3 class*/


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