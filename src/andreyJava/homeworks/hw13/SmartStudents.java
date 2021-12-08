package andreyJava.homeworks.hw13;

/*Сообразительные студенты тоже точно сдают зачет, если посетили все занятия, если были более чем на половине занятий, то сдают;
иначе не сдают зачет*/
public class SmartStudents extends Student {


    public SmartStudents(String name, int visits) {
        super(name, visits);
    }

    @Override
    boolean passExam() {
        return getVisits() > 10;
    }
}
