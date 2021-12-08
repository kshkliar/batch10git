package andreyJava.lessons.inheritrance.polymorphism;

public class Animal {
    public void sound() {
        System.out.println("Some sound" + (1/0));
    }

    public void print(int a) {

    }

    public void print(String s) {

    }
}

class Mouse extends Animal {

    @Override
    public void sound() {
        System.out.println("Pi-pi-pi");
        System.out.println("Some sound" + (1/0));

    }
}

class Cow extends Animal {
    public void sound() {
        System.out.println("Muuu");
    }
}
//раннее позднее связывание
class TestPolymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Animal mouse = new Mouse();//куда указываеться ссылка

        mouse.sound();
    }
}


