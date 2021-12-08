package andreyJava.homeworks.hw09;

/*) Создать приложение, позволяющие людям знакомиться.
   Приложение должно позволять:
   1) Сохранять человека старше 18 лет.
   2) После сохранения выводить список подходящих мужчин/ женщин для этого человека по возрасту.
   3) Просматривать зарегистрировавшихся людей. Для мужчин выводить только женщин и наоборот.
   4) Просматривать анкету отдельного человека(поиск по имени и фамилии)
   5) Организовать "умный поиск". Пользователь вводит требования
   (город, пол, возраст, количество детей) и  выводить людей,
   которые соответствуют требованиям.*/
public class Person {
    private int age;//примитивный тип данных
    private Gender gender;//сслыка на обьект
    private String name;//сслыка на обьект
    private String lastName; //ссылочный тип данных
    private String city;
    private int childrenNum;//примитивный тип данных
//эти ссылки будут проинициализированнны другими ссылками когда мы будем вызывать конструктор
    //fields


    public Person(int age, Gender gender, String name, String lastName, String city, int childrenNum) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.childrenNum = childrenNum;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public int getChildrenNum() {
        return childrenNum;
    }

    public void view() {
        System.out.println("Name " + name + " gender: " + gender);
    }
}
