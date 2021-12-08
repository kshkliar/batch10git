package andreyJava.homeworks.hw13_02;

public class HumanTester {
    public static void main(String[] args) {

        Human h1 = new Informals(20);
        Human h2 = new Informals(21);
        Human h3 = new Realists(22);
        Human h4 = new Formalists(23);
        Human h5 = new Formalists(24);

        //как сзязать классы что бы они здоровались
        Human[] humans = {h1, h2, h3, h4, h5};//передали массив  хьюманов в хьюманс
        HumanService service = new HumanService(humans);//-- вот сюда передать массив humans( в конструктор екземпляра хьюман сервис)
        service.greet();
//        service.displayInfo();
//создать массив human и передать в конструктор  human service

    }
}
