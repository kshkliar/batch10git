package andreyJava.lessons.inheritrance.interfaces;

public class LearnInterfaces {
    public static void main(String[] args) {
        Workable workable = new Work();
    }
}

interface Workable {
    public static final int COUNT_PERSONS = 5;
    public abstract void doIt();

    default void print() {
        System.out.println("1");
    }

    static void stMethod() {

    }

  /*  private void prMethod() {

    }*/
}

class Work implements Workable {
    @Override
    public void doIt() {
        System.out.println("Do some work");
    }

    @Override
    public void print() {
        System.out.println("2");
    }
}
