package andreyJava.homeworks.hw11;

/*Создать интерфейс Calculable с методом calculateSquare и default метод print, который печатает название фигуры.
Создать абстрактный класс Figure с полями(длина стороны, высота), который реализует интерфейс Calculable.
Создать классы Triangle, , Rhombus. В классах наследниках переопределить метод calculateSquare,
для расчета площади.
Протестировать функционал.*/
public interface Calculable {

    void calculateSquare();

    default void print() {//в параметрах должен указываться тип данных что б затем этот метод можно было
        // реализовать переопределив? Можно ли пустым оставить метод- без параметров( если убрать figure все завалиться)
        System.out.println("Some figure");
    }
}


//можно было ли метод принт отставить без параметров