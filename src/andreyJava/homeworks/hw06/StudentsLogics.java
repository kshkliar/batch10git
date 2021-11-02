package andreyJava.homeworks.hw06;
/* вывести данные о студенте с учетом данных об университете и группе.
 - проверять группы на одинаковость у двух студентов.
 - проверять университеты на одинаковость у двух студентов.
 - проверять однофамильцев у двух студентов.*/

public class StudentsLogics {

    public void checkGroups(Group group1, Group group2) {
        if (group1.getName().equals(group2.getName())) {
            System.out.println("Groups is equal");
        } else {
            System.out.println("Groups is different");
        }
    }

    public void checkUniversities(Student st1, Student st2) {//университеты
        if (st1.getUniversity().equals(st2.getUniversity())) {
            System.out.println("Universities is equal");
        } else {
            System.out.println("Universities is not equal");
        }

    }

    public void checkLastNames(Student st1, Student st2) {//однофамильцы

        if (st1.getLastName().equals(st2.getLastName())) {
            System.out.println("Both last names is equal");
        } else {
            System.out.println("Last names is not the same");
        }
    }
    //  public void checkGroups(Student st1, Student st2) {


}
