package andreyJava.homeworks.hw13;

import java.util.Arrays;
import java.util.Random;

/*Создайте массив из 10 студентов (5 обычных, 4 сообразительных и 1
гения), задайте их ФИО и количество посещенных занятий константами (не статические),
указанными в конструкторах объектов и промоделируйте сдачу зачета (вызвать метод -здать зачет) с
выводом подробных результатов (всех сведений о студентах, а также
результате сдачи)*/
public class StudentTester {
    public static void main(String[] args) {
        //а если бы их 500 было, как тогда?

        Student cSt1 = new CommonStudents("A", 5);
        CommonStudents cSt2 = new CommonStudents("B", 12);
        CommonStudents cSt3 = new CommonStudents("C", 13);
        CommonStudents cSt4 = new CommonStudents("D", 14);
        CommonStudents cSt5 = new CommonStudents("F", 15);

        SmartStudents sSt1 = new SmartStudents("H", 4);
        SmartStudents sSt2 = new SmartStudents("I", 11);
        SmartStudents sSt3 = new SmartStudents("G", 15);
        SmartStudents sSt4 = new SmartStudents("K", 12);

        GeniusStudents gSt1 = new GeniusStudents("L", 2);

        Random random = new Random();
        //задайте их ФИО и количество посещенных занятий константами (не статические),//как это сделать
        String[] names = {"A", "B", "C", "E", "F"};//рандомные имена для массива из 500 -та студентов

        Student[] students = new Student[500];//300 nulls

        for (int i = 0; i < 200; i++) {

            int visits = random.nextInt(21);

            int indexName = random.nextInt(names.length);//0..5//получаем любое случайное число от 0 до 5 в качестве индекса

            String name = names[indexName];//взять у массива намес случайное имя и передать в строку 55 в качестве аргумента

            students[i] = new GeniusStudents(name, visits);

//            System.out.println(students[i]);
        }

        for (int i = 200; i < 400; i++) {

            int visits = random.nextInt(21);

            int indexName = random.nextInt(names.length);//0..5

            String name = names[indexName];

            students[i] = new CommonStudents(name, visits);

//            System.out.println(students[i]);

        }

        for (int i = 400; i < students.length; i++) {

            int visits = random.nextInt(21);

            int indexName = random.nextInt(names.length);//0..5

            String name = names[indexName];

            students[i] = new SmartStudents(name, visits);

//            System.out.println(students[i]);

        }

        System.out.println(Arrays.toString(students));
    }
}

//( остались методы и константы для студентов -задайте их ФИО и количество посещенных занятий константами (не статические)
//массив констант нужно создать