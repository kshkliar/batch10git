package andreyJava.lessons.learn_class;
// задача -->сравнить возраст групп
import andreyJava.homeworks.hw03.Group;
import andreyJava.homeworks.hw03.Student;

public class WorkWithStudents {
    public boolean checkAges(Student st1, Student st2) {// тоже самое что student 1
        int age1 = st1.getAge();
        int age2 = st2.getAge();

        if (age1 > age2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkAgeGroups(Student st1, Student st2) {
        Group group1 = st1.getGroup();
        Group group2 = st2.getGroup();

        int year1 = group1.getYear();
        int year2 = group2.getYear();

        if (year1 > year2) {
            return true;
        } else {
            return false;
        }
    }
}

class TestWorkWithStudents {
    public static void main(String[] args) {

        Group it = new Group(10);
        Group manager = new Group(12);

        Student student1 = new Student("Vasiliy", 25, 21, 300);

        student1.setGroup(it);

        Student student2 = new Student("Vasiliy", 25, 25, 300);

        student2.setGroup(manager);

        WorkWithStudents wws = new WorkWithStudents();

        boolean check = wws.checkAges(student1, student2);// тоже самое что st1  и st2

        System.out.println(check);
    }
}
