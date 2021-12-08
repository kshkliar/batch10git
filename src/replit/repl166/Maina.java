package replit.repl166;
/*Create a class Animal in which define instance variable type,
constructor that will initialize instance variables and 2 methods eat and sleep.
Create a subclass Cat in which override method sleep
Create 3 Kitten subclasses of a Cat class and override method eat
for 1 kitten - eats milk
for 2 kitten - eats snack
for 3 kitten - eats everything
In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
**Expected Output:**
Cat eats
Cat sleeps a lot
kitten1 eats milk
kitten1 sleeps a lot
kitten2 eats snacks
kitten2 sleeps a lot
kitten3 eats everything
kitten3 sleeps a lot
```*/

class Animala {
    String type;

    public Animala(String type) {
        this.type = type;
    }

    void eat() {
        System.out.println(type + " can eat");
    }

    void sleep() {
        System.out.println(type + " can sleep");
    }
}

class Cata extends Animala {

    public Cata(String type) {
        super(type);
    }

    void sleep() {
        System.out.println(type + " can sleep");
    }
}

class Kittena1 extends Cata {
    public Kittena1(String type) {
        super(type);
    }

    void eat() {
        System.out.println(type + " eats milk");
    }
}

class Kittena2 extends Cata {
    public Kittena2(String type) {
        super(type);
    }

    void eat() {
        System.out.println(type + " eat snack");
    }
}

class Kittens3 extends Cata {
    public Kittens3(String type) {
        super(type);
    }

    void eat() {
        System.out.println(type + " eat everything");
    }
}


public class Maina {
    public static void main(String[] args) {

        Cata cat = new Cata("Cat");
        Kittena1 k1 = new Kittena1("k1");
        Kittena2 k2 = new Kittena2("K2");
        Kittens3 k3 = new Kittens3("K3");

        Animala[] array = {cat, k1, k2, k3};
        for (Animala i : array) {
            i.sleep();
            i.eat();
        }
    }
}


