package andreyJava.homeworks.hw09;

public class TestPerson {
    public static void main(String[] args) {
//здесь создаем обьект который будет тестировать логику
        Person person1 = new Person(17, Gender.FEMALE, "Kate", "Popova", "Kyiv", 2);
        Person person2 = new Person(24, Gender.MALE, "Ivan", "Dorn", "Lugansk", 3);
        Person person3 = new Person(24, Gender.FEMALE, "Ann", "Smith", "Boston", 1);
        Person person4 = new Person(21, Gender.FEMALE, "Vika", "Drozdova", "Zhytomir", 1);
        Person person5 = new Person(27, Gender.MALE, "Nikolay", "Popov", "Odessa", 2);

        PersonService ps = new PersonService(10);//вызываем обьект персон сервис

         ps.addPerson(person1);//вызываю метод на обьекте персон сервис
        ps.addPerson(person2);
        ps.addPerson(person3);
        ps.addPerson(person4);
        ps.addPerson(person5);// почему этот не вывелся на консоль
       // System.out.println(person5);
        System.out.println("-----------");
        ps.watchPeople(Gender.MALE);//почему не выводиться?

    }
}


//откуда взялся person в PersonService