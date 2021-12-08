package andreyJava.homeworks.hw13;

/*Обычные студенты точно сдают зачет, если посетили все занятия, если были
более чем на половине занятий, иначе не
сдают.*/
public class CommonStudents extends Student {

    public CommonStudents(String name, int visits) {
        super(name, visits);
    }

    @Override
    public boolean passExam() {// а как его определить без параметров( не создавая локальную переменную?
        return getVisits() > 10;// обратиться к поле визит через геттер( который нужно сделать в родительском классе
        //и через него обращаться// !!( параметры не нужны)
    }
}
