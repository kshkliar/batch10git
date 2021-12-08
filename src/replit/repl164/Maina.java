package replit.repl164;
/*Create a method hello() in parent class that will print "method in Parent class"
 then override  that method is 3 Subclasses implementing login to
 print "method in Child1/Child2/Child3 class"
In Main Class create 3 object of the child classes and store in into an array and
 call method hello():
**Expected Output:**

method in Child1 class
method in Child2 class
method in Child3 class*/

class Parenta {

    void hello() {
        System.out.println("method in Parent class");

    }
}

class Chailda1 extends Parenta {

    void hello() {
        System.out.println("method in Child1 class");
    }


}

class Chailda2 extends Chailda1 {

    void hello() {
        System.out.println("method in Child2 class");
    }
}

class Chailda3 extends Chailda2 {
    void hello() {
        System.out.println("method in Child3 class");
    }
}


class Maina {
    public static void main(String[] args) {


        Chailda1 obj1 = new Chailda1();
        Chailda2 obj2 = new Chailda2();
        Chailda3 obj3 = new Chailda3();

        Parenta[] objectArr = {obj1, obj2, obj3};
        for (Parenta i : objectArr) {
            i.hello();
        }
    }
}

