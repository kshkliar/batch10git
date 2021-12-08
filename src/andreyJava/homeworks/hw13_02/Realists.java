package andreyJava.homeworks.hw13_02;

public class Realists extends Human {

    public Realists(int age) {
        super(age);
    }

    /*сли возраст собеседника меньше или равен или больше не
    более чем на 5 лет, говорит «Привет, <имя>!», иначе «Здравствуй,
    <имя>».*/
    String greet(Human human) {
        return "Hi " + human.getName();
    }

    String tellAboutYourself() {
        if (getAge() >= 5)
            return "Hi " + getName() + " I am Realist";
        else {
            return "Hello " + getName() + " I am Realist";
        }
    }
}
