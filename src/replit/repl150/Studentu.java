package replit.repl150;

public class Studentu extends Employeea{

        int grade;

        Studentu(String name, String lastName, int age, int grade) {
            super(name, lastName, age);
            this.grade = grade;
        }

        public Studentu(String name, String lastName, int age ) {
            super(name, lastName,age);
            this.grade = grade;
        }

        @Override
        void print() {
            System.out.println(name + " " + lastName + " " + age + " " +grade);
        }
    }

