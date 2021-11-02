package andreyJava.homeworks.hw06;

public class University {

    private School university;
    String nameOfUniversity;
    public int numOfGroups;
    public int foundationDate;

    public University(School university) {
        this.university = university;
    }

    public int getNumOfGroups() {
        return numOfGroups;
    }

    public int getFoundationDate() {
        return foundationDate;
    }

}
