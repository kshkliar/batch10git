package andreyJava.homeworks.hw15.task01;

public interface Actinable {

    default public void accelerate() {
        System.out.println("");
    }

    default public void brake() {
        System.out.println("");
    }
}
