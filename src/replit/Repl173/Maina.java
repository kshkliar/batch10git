package replit.Repl173;
/*# Abstraction
Create a Super Class Tea that will have:
- instance variable teaType;
- constructor that will initialize
- unimplemented method addSugar(),
Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
In main class create an object of 2 Child and assign them to Parent reference type.
Execute method addSugar from both classes.
**Expected Output:**
For Lemon Tea we need 2 spoons of sugar
For Chai Tea we need 1 spoon of sugar*/

abstract class Teaa {
    String teatype;

    public Teaa(String teatype) {
        this.teatype = teatype;
    }


    abstract void addSugar();

}

class leamonTea extends Teaa {
    public leamonTea(String teatype) {
        super(teatype);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teatype+ " we add 2 spoons of sugar");
    }
}

class ChaiTeaa extends Teaa {
    public ChaiTeaa(String teatype) {
        super(teatype);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teatype+ " we need 1 spoon of sugar");
    }
}


class Maina {

    public static void main(String[] args) {
        Teaa obj1 = new leamonTea("Leamon Tea");
        obj1.addSugar();
        Teaa obj2 = new ChaiTeaa("Chai Tea");
        obj2.addSugar();
    }

}
