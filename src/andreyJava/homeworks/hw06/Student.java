package andreyJava.homeworks.hw06;

/*Создать класс Student c полями имя, пол(enum), фамилия, возраст, Group(отдельный класс-джава файл), University(отдельный класс).
Создать класс Group c полями название, кол-во студентов.//обьяснение, тоже что и предыдущее предложение
Создать класс University c полями название(enum), кол-во групп, дата основания.

Создать несколько студентов:(students service- отдельный класс методов)
- с одинаковой группой и университетом.
- с разными группами в университете.
Создать методы позволяющие:
 - вывести данные о студенте с учетом данных об университете и группе.
 - проверять группы на одинаковость у двух студентов.
 - проверять университеты на одинаковость у двух студентов.
 - проверять однофамильцев у двух студентов.*/
//(тестирование , где будем проверять значения)
public class Student {
    private String name;
    private Gender gender;//enam
    private String lastName;
    private int age;
    private Group group;//отдельный класс
    private School university;//enam, отдельный класс enam;


    public Student(String name, Gender gender, String lastName, int age, Group group, School university) {
        this.name = name;
        this.gender = gender;
        this.lastName = lastName;
        this.age = age;
        //   this.group = group;
        this.university = university;
    }

    public Student(String name, Gender gender, String lastName, int age) {
        this.name = name;
        this.gender = gender;
        this.lastName = lastName;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Group getGroup() {
        return group;
    }

    public School getUniversity() {
        return university;
    }

    public void displayInfo() {
        System.out.println("Name is " + name + " " + lastName + " gender is " + age + " group is " + group +
                " university is" + university);//тут группа неправильно
    }
}
