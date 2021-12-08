package andreyJava.homeworks.hw13_02;

/*В программной реализации приветствие должно быть реализовано как
полиморфный метод, принимающий параметр – человек и возвращающий строку.
Рассказ о человеке является строкой вида «Меня зовут Вася, мой возраст
21 лет, я неформал» (вместо Вася имя человека, вместо 21 его возраст,
как видите у людей с грамматикой не все в порядке и они говорят «лет»
после любого числа, если хотите, можете реализовать правильную
грамматику, вместо неформал может быть формалист, либо реалист).*/
public class HumanService {

    private Human[] humans;//массив как поле по аналогии а положили туда в тестере
//в тесте ссылку на масив мы передали в конструктор и массив стал заполненным
    public HumanService(Human[] humans) {//конструкто рhumanservice требует массива
        this.humans = humans;
    }

    public void greet() {//пройтись по массиву и вызвать метод

        for (int i = 0; i < humans.length; i++) {

            Human human = humans[i];

            for (int j = i + 1; j < humans.length; j++) {//здесь берем следующего человека в том же масиве
                Human person = humans[j];

                String greetings = human.getName() + ":\t" + human.greet(person) + "\n" +
                        person.getName() + ":\t" + person.greet(human);

                System.out.println(greetings);
            }
        }

    }

    //Программа должна показать информацию обо всех людях
    void displayInfo() {

        for (Human h : humans) {
       // humans[h]=Human human не получилось положить хьюмана в елемент масива
            System.out.println(h.tellAboutYourself());
        }
        //tell  - пройтись по массиву humans  и вызвать tell about yourself метод
    }

}
