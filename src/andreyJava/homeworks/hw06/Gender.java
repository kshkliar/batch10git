package andreyJava.homeworks.hw06;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");


    Gender(String shortName) {
        this.shortName = shortName;
    }

    private String shortName;

    public String getShortName() {
        return shortName;
    }
    }
