package replit;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/* Create a Class main
In this Class, you should specify the following attributes: breed, name, color, and
following behaviors:bark(), run(), play().
Create a 3 different objects of it :Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following
 */
public class Task088 {
    String breed, name, color;

    public static void main(String[] args) {

        Task088 b = new Task088();
        b.breed = "Bulldog";


        Task088 l = new Task088();
        l.breed = "Labrador";

        Task088 h = new Task088();
        h.breed = "Husky";

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
void bark(){
    System.out.println(breed+ " can bark");
}
void run(){
    System.out.println(breed+ "can run");
}
void play(){
    System.out.println(breed + " can play");
}
}
