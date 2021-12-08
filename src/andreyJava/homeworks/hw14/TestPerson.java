package andreyJava.homeworks.hw14;

public class TestPerson {

    public static void main(String[] args) {
   //     displaySomeInfo("Ann");// elon не появился
   //     displaySomeInfo("Oleg", "Luzniy", 45, "M");
        //появились сомнения что я правильно понял задание
        Person person = new Person();
        String s = person.displaySomeInfo("1");
//записали в стринг s  а затем ее распичатали sout
        System.out.println(s);
    }
}
