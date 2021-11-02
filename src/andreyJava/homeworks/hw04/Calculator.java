package andreyJava.homeworks.hw04;
/*Создать класс Калькулятор(без полей).
        Создать методы для операций +, -, *, /,
         принимающие два параметра и возвращающие результат.
        Вывести в консоль результат.*/

public class Calculator {

    int addition(int a, int b) {
        return a + b;
    }

    int substruction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        return a / b;
    }
}

class CalculatorTester {
    public static void main(String[] args) {
        Calculator m = new Calculator();
        System.out.println("Addition: " + m.addition(20, 4));
        System.out.println("Substruction: " + m.substruction(40, 20));
        System.out.println("Multiplication: " + m.multiplication(10, 3));
        System.out.println("Division: " + m.division(40, 20));
    }

}