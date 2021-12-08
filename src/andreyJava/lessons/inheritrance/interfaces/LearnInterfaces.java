package andreyJava.lessons.inheritrance.interfaces;

public class LearnInterfaces {
    public static void main(String[] args) {
        Workable workable = new Work();
    }
}

interface Workable {
    public static final int COUNT_PERSONS = 5;//поля в интерфейсе константы
    public abstract void doIt();

    default void print() {
        System.out.println("1");
    }// теперь методы могут иметь дефолт методы и статические

    static void stMethod() {

    }

  /*  private void prMethod() {

    }*/
}

class Work implements Workable {//реализует интерфейсб дает методам интерфейса тело
    @Override //переопределить - дать другое тело
    public void doIt() {
        System.out.println("Do some work");
    }

    @Override
    public void print() {
        System.out.println("2");
    }
}
