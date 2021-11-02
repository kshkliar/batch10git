package andreyJava.homeworks.hw05;

public class ManService {
    public void checkPosition(Man man1, Man man2) {

        if (man1.getPosition().getName().equals(man2.getPosition().getName())) {
            System.out.println("Both positions is equal");
        } else {
            System.out.println("Position is not the same");
        }
    }

    public  void checkNames(Man man1, Man man2) {

        if (man1.getsurName().equals(man2.getsurName())) {
            System.out.println("Both names is equal");
        } else {
            System.out.println("Names is not the same");
        }
    }

}
