package andreyJava.homeworks.hw13;

public class GeniusStudents extends Student {

    public GeniusStudents(String name, int visits) {
        super(name, visits);
    }
//по аналогии с обычными студентами

    @Override
    public boolean passExam() {
        return getVisits() > 1;
    }
}
