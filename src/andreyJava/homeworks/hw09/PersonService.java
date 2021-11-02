package andreyJava.homeworks.hw09;

import java.util.Objects;

public class PersonService {
    private Person[] people;

    public PersonService(int size) {
        people = new Person[size];//nulls
    }

    public void addPerson(Person person) {
        for (int i = 0; i < people.length; i++) {
            if (Objects.isNull(people[i])) {
                people[i] = person;
                break;
            }
        }
        showSuitablePersons(person);
    }

    private void showSuitablePersons(Person person) {
        //
    }

}
