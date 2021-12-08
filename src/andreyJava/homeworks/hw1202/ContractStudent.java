package andreyJava.homeworks.hw1202;

public class ContractStudent extends Student {
    private boolean contract;

    public ContractStudent(String name, String faculty, int course, int minScore, boolean transferToNextCourse) {
        super(name, faculty, course, minScore, transferToNextCourse);
    }

    public boolean transferToNextCourse(int minScore) {

        return false;
    }

    public int scholarship(int minScore) {

        int scholarship = 0;
        return scholarship;
    }
}
