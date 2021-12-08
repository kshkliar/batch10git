package andreyJava.lessons.inheritrance;

public class Bmw extends Vehicle {

    private String bmwModel;// расширил класс вехикл этой стрингой

    public Bmw(String name, int age, String bmwModel) {
        super(name, age);
        this.bmwModel = bmwModel;
    }

    @Override
    public void drive() {

    }

    @Override
    void action() {

    }
}

interface Drivable {
    void drive();
}

class Fiat extends Vehicle {//is-a   отношение-одновременно и потомок и родитель -добавив новое поле получил класс фиат
    //класс фиат расширяет класс вехикл
    private String fiatModel;

    public Fiat(String name, int age, String fiatModel) {
        super(name, age);//вызыываем конструктор словом super
        this.fiatModel = fiatModel;
    }

    @Override
    public void drive() {

    }

    @Override
    void action() {

    }

    public String getFiatModel() {
        return fiatModel;
    }
}

abstract class Vehicle implements Drivable {
    private String name;
    private int age;

    public Vehicle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void action();//абстрактные классы не имеют тела

    /*@Override
    public abstract void drive();*/

   /* @Override
    public void drive() {
        System.out.println("Drive car");
    }*/

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class TestInheritance {
    public static void main(String[] args) {
//        Fiat fiat = new Fiat("Fiat", 10,"45");//обьект класса фиакт в который вынуждены передавать и параметры
        Drivable drivable = new Fiat("Fiat", 10,"45");//обьект класса фиат в который вынуждены передавать и параметры
   //     System.out.println(fiat);

    }
}