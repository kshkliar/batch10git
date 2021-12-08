package andreyJava.homeworks.hw13_02;

public class Formalists extends Human {

    public Formalists(int age) {
        super(age);
    }

    //    Здороваются со всеми так: «Здравствуй, <имя>», где
//            <имя> – имя человека, с которым он здоровается.
    String greet(Human human) {
        return "Hi " + human.getName() ;
    }

    String tellAboutYourself() {
        return "Hi " + super.tellAboutYourself() + " I am Formalist";//супер -вызов метода из родителя
        //также сделать у реалиста и неформала
    }
}
