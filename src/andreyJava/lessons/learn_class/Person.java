package andreyJava.lessons.learn_class;

public class Person {
    private int age;//field age
    private int childs;//field childs
    private Person person;

    public Person(int age, int newChilds) {//age = 15-параметры для инициализации полей
        this.age = age;//age = age(15)  -- иницилиализируем поля в обьтекте, значения потом
        childs = newChilds;// это действие
    }

    public Person(int newAge) {
        age = newAge;
    }

    public Person() {
    }
//Общий шаблон метода:
//    access_modifier (static or absent) (void or return type) name(params or absent) {}

    public void setAge(int newAge) { //нужен для изменения значения полей существующего обьекта
        if (newAge < 0) {
            this.age = 1;
        } else {
            age = newAge;
        }
    }

    public void setChilds(int childs) {
        this.childs = childs;
    }

    public int getAge() {
        return age;
    }

}

class TestPerson {
    public static void main(String[] args) {
//        datatype name_reference = new datatype(params or absent);
        Person p1 = new Person(10, 0);
        Person p2 = new Person(10);
        Person p3 = new Person();
        p3.setAge(20);
        p3.setChilds(1);

        // p1.age = -10;
//        p1.childs = 0;
        p1.setAge(20);
        p2.setAge(30);

        int newAge = p1.getAge();

        System.out.println(newAge);

        Person p4 = new Person(30, 2);

        //p2.age = 30;
//        p2.childs = 2;
    }
}


