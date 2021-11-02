package andreyJava.homeworks.hw06;

public class TestStudents {

    public static void main(String[] args) {

        Group group1 = new Group("IT");
        Group group2 = new Group("management");
        University university = new University(School.KPI);
        // University university = new University("Politech");

        //(String name, Enams gender, String lastName, int age, Student group, Enams university)

        Student st1 = new Student("Victor", Gender.MALE, "Yakunovich", 65, group1, School.KPI);

        Student st2 = new Student("Mykola", Gender.MALE, "Veresen", 57, group2, School.MAUP);

        StudentsLogics checker = new StudentsLogics();
        Student display = new Student();
        st1.displayInfo(); // не работает
        checker.checkLastNames(st1, st2);
        //Не получилось вывести данные и сравнить группы!
        checker.checkUniversities(st1, st2);
        checker.checkGroups(group1, group2);
        // checkGroup.checkGroups(group1,group2);
        // Group checkGroup=new Group();
        // checkGroup.c
        //   st1.d
        //  checker.checkUniversity(st1, st2);
        //    checker.checkNames(st1, st2);
    }
}
