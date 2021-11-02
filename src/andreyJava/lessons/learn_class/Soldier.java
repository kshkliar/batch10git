package andreyJava.lessons.learn_class;

public class Soldier {
    private int age;
    private static int countAlive;

    public static int getCountAlive() {
        return countAlive;
    }

    public static void setCountAlive(int countAlive) {
        Soldier.countAlive = countAlive;
    }

    public void setAge(int age) {
        setCountAlive(10);
        this.age = age;
    }
}

class TestSoldier {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier();
        Soldier soldier2 = new Soldier();

        soldier1.setCountAlive(10);

        System.out.println(soldier2.getCountAlive());

        /*Soldier.countAlive = -12;

        System.out.println(Soldier.countAlive);*/

        Soldier.setCountAlive(20);

    }
}