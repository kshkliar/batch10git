package andreyJava.homeworks.hw13_02;

public class Informals extends Human {

    public Informals(int age) {
        super(age);

    }

    /*(Неформалы) Со всеми здороваются: «Привет, <имя>!»
     * */

    String greet(Human human) {
        return "Hi " + human.getName() ;
    }

    String tellAboutYourself() {
        return "Hi " + super.tellAboutYourself() + " I am informal";
    }
}
