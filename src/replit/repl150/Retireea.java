package replit.repl150;

public class Retireea extends Studentu {
    String seniorActivity;


    public Retireea(String name, String lastName, int age, int grade, String seniorActivity) {
        super(name, lastName, age, grade);
        this.seniorActivity = seniorActivity;
    }

    Retireea(String name, String lastname, int age, String seniorActivity) {
        super(name, lastname, age);
        this.seniorActivity = seniorActivity;
    }

    @Override
    void print() {
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
    }
}