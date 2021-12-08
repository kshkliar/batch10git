package andreyJava.homeworks.hw09;

import java.util.Objects;

public class PersonService {
    private Person[] people;

    public PersonService(int size) {//  конструктор персон сервиса
        people = new Person[size];//nulls
    }

    public void addPerson(Person person) {//это ссылка -сюда прийдет ссылка типа данных Person персон(откуда взялся) сохранился на этом этапе -добавился
//что делаем на этом этапе, - что подаем в качестве аргумента person же раньшне небыло?
        if (person.getAge() < 18) {
            System.out.println("You age is small");
            return;
        }

        for (int i = 0; i < people.length; i++) {
            if (Objects.isNull(people[i])) {
                people[i] = person;//записываем полученные аргументы в елементы массива с значением налл

                break;
            }
        }
        showSuitablePersons(person);//какая цель этой строки?
    }

    private void showSuitablePersons(Person person) {//будет в этот метод прилетать person -не путать поле и параметр в метод что будет ссылкой типа Person
        // сделать метод который будет сравнивать
        //После сохранения выводить список подходящих мужчин/ женщин для этого человека по возрасту.
        for (Person p : people) {
            if (Objects.nonNull(p) &&
                    p.getGender() != person.getGender() &&
                    p.getAge() == person.getAge()) {
                p.view();
            }// сравнить противоположный пол но одинаковый по возрасту
        }


    }

    // Просматривать зарегистрировавшихся людей. Для мужчин выводить только женщин и наоборот.

    public void watchPeople(Gender gender) {//будет прилетать gender
        for (Person p : people) {
            if (Objects.nonNull(p) && p.getGender() != gender) {
                p.view();
            }
        }
    }

    public void showPeople(String name, String lastName) {//сбда поступают такие аргументы с которыми в теле метода мы работаем
        for (Person p : people) {
            if (Objects.nonNull(p) &&
                    p.getName().equals(name) &&
                    p.getLastName().equals(lastName)) {
                p.view();
            }
        }
    }
    //передаем сюда ссылки на обьекты и сравниваем с теми ссылками которые есть в обьекте персон:
    public void smartSearch(int age, Gender gender, int childrenNumber, String city) {
        for (Person p : people) {//для каждогого p (елемента-который мы назвали переменной p)
            //  из (массива) people, будет сделать:
            if (Objects.nonNull(p) &&
                    p.getAge() == age &&
                    p.getGender() == gender &&
                    p.getChildrenNum() == childrenNumber&&p.getCity().equals(city)) {
                p.view();
            }
        }
    }
}
