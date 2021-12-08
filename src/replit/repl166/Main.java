package replit.repl166;
/*Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
Create a subclass Cat in which override method sleep
Create 3 Kitten subclasses of a Cat class and override method eat
for 1 kitten - eats milk
for 2 kitten - eats snack
for 3 kitten - eats everything
In main method create object of Cat class and all 3 kittens
classes and store into an array of Animals. Call available methods:
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

    class Animal{
        String type;
        Animal(String type){
            this.type=type;
        }

        void eat(){
            System.out.println(type+" eats");
        }
        void sleep(){
            System.out.println(type+" sleeps a lot");
        }
    }
    class kitten1 extends Animal{
        kitten1(String type){
            super(type);
        }
        void eat(){
            System.out.println(type+" eats milk");
        }
    }
    class kitten2 extends kitten1{
        kitten2(String type){
            super(type);
        }
        void eat(){
            System.out.println(type+" eats snacks");
        }
    }
   class kitten3 extends kitten2{
        kitten3(String type){
            super(type);
        }
        void eat(){
            System.out.println(type+" eats everything");
        }
    }


public class Main {
    public static void main(String[] args){
        Animal obj=new Animal("Cat");
        obj.eat();
        obj.sleep();
        kitten1 obj1=new kitten1("kitten1");
        obj1.eat();
        obj1.sleep();
        kitten2 obj2=new kitten2("kitten2");
        obj2.eat();
        obj2.sleep();
        kitten3 obj3=new kitten3("kitten3");
        obj3.eat();
        obj3.sleep();
        /* Cata cat = new Cata("Cat");
        Kittena1 k1 = new Kittena1("k1");
        Kittena2 k2 = new Kittena2("K2");
        Kittens3 k3 = new Kittens3("K3");

        Animala[] array = {cat, k1, k2, k3};
        for (Animala i : array) {
            i.sleep();
            i.eat();*/
    }
}