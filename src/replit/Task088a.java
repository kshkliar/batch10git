package replit;

/* Create a Class main
In this Class, you should specify the following attributes: breed, name, color, and
following behaviors:bark(), run(), play().

Create a 3 different objects of it :Husky, Bulldog, Labrador with specific attributes
and behaviors.
The output of the program should be as following
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
 */
public class Task088a {

 String breed, name, color;

    public static void main(String[] args) {
        Task088a h =new Task088a();
        h.breed="Haski";

        Task088a b=new Task088a();
        b.breed="Bulldog";

        Task088a l=new Task088a();
        l.breed="Labrador";


        h.bark();
        h.run();
        h.play();
        b.bark();
        b.run();
        b.play();
        l.bark();
        l.run();
        l.play();

    }

    void bark() {// создаем метод
        System.out.println(breed+ " can bark");
    }

    void run() {
        System.out.println(breed+ " can run");
    }

    void play() {
        System.out.println(breed+ " can play");
    }
}
