package andreyJava.homeworks.hw1202;

/*В главной программе создать объект
класса Студент и 2 объекта класса Студент-контрактник (один из
которых уплатил за контракт, а другой нет). Выдать информацию о
студентах, затем применить к ним метод «Перевести на следующий
курс» и снова выдать информацию о них.*/
public class StudentTester {

    public static void main(String[] args) {

        Student student = new Student("Ivan", "Marketing", 2, 3, true);

        ContractStudent student1 = new ContractStudent("Misha", "IT", 3, 3, true);

        ContractStudent student2 = new ContractStudent("Ann", "Management", 2, 2, false);

        student.transferToNextCourse(5);

        System.out.println(student.displayInfo());

    }

}
