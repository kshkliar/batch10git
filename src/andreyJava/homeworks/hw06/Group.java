package andreyJava.homeworks.hw06;

public class Group {
    private String name;
    private int numberOfStudents;

    public Group(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getNumber() {
        return numberOfStudents;
    }

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


