package andreyJava.homeworks.hw03;

/*1.)Создать класс Student c полями: кол-во проучившихся лет, возраст, размер стипендии.
2.)Создать методы для изменения и получения полей класса, а также метод вывода
в консоль полей.(это геттеры и сеттеры)
3.)Организовать проверку на некорректные значения полей.(проверить все поля геттерами и сеттерами)
4.)Создать несколько объектов класса, измениить поля и вывести в консоль.*/
public class Student {//
    static String name;
    private int years;
    private int age;
    private int scholar;// 1)
    private Group group;

    public Student(String name, int newCourse, int newAge, int newScholar) {
        years = newCourse;//   нужен ли здесь конструктор , если да  зачем
        age = newAge;
        scholar = newScholar;
    }

    public void setAge(int newAge) {
        if (newAge < 21 && newAge > 0) {
            System.out.println("Student is young");
            if (newAge >= 21 && newAge <= 27)
                System.out.println("Student is adult");
        } else {
            System.out.println("Is senior student");
        }
    }

    public void newScholar(int newScholar) {
        if (newScholar < 300 && newScholar > 0) {
            System.out.println("Student gets small scholarship");
        } else if (newScholar >= 300 && newScholar <= 700) {
            System.out.println("Student gets medium scholarship");
        } else if (newScholar > 700) {
            System.out.println("gets big scholarship");
        } else {
            System.out.println("Invalid number");
        }
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public int getScholar() {
        return scholar;
    }

    public void printFields() {
        System.out.println(name + " age is " + age + " years old");
    }
}


class StudentTester {
    public static void main(String[] args) {

        Student student1 = new Student("Vasiliy", 25, 21, 300);
        student1.name = "Vasiliy";
        student1.printFields();
        student1.newScholar(200);
        student1.setAge(21);

        Student student2 = new Student("Anna", 22, 27, 800);
        student2.name = "Anna";  // в итоге конструктор смешался с методом и Василий пропал
        student2.printFields();
        student2.setAge(27);
        student2.newScholar(800);


    }
}