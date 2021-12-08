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
abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}

class LemonTea extends Tea{
    LemonTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea{
    ChaiTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }
}
class Main{
    public static void main(String[] args){
        Tea obj1=new LemonTea("Lemon Tea");
        obj1.addSugar();
        Tea obj2=new ChaiTea("Chai Tea");
        obj2.addSugar();

    }
}
