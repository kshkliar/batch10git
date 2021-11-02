package andreyJava.homeworks.hw05;

import andreyJava.lessons.learn_enum.Country;

public class TestPositions {
    public static void main(String[] args) {

        Position singer = new Position("singer");
        Position engineer = new Position("engineer");

        Man man1 = new Man("Bob", "Male", "Marley", 45, singer, Country.UKRAINE);

        Man man2 = new Man("Elon", "Male", "Mask", 47, engineer);

        ManService checker = new ManService();
        checker.checkPosition(man1, man2);
        checker.checkNames(man1, man2);
    }
}
