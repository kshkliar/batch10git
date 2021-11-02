package andreyJava.lessons.learn_enum;

public enum Country {
    UKRAINE("Ukraine"),
    BRAZILIA("Bra"),
    UK("Uk");

    private String shortName;

    Country(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
