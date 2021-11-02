/*
package AndreyJava.Homeworks.homework.hw04;

*/
/*Создать класс Калькулятор(с полями).
Создать методы для операций +, -, *, / над полями, возвращаюшие результат.
Вывести в консоль результат.
Перед каждым действием менять значения полей.*//*

public class Calculator2 {

    private int operand1;
    private int operand2;

    public Calculator2(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    int add() {
        return operand1 + operand2;
    }

    public void setOperand1(int operand1) {
        this.operand1=operand1;
    }

    int sub() {
        return operand1 - operand2;
    }

    int multiplication(int a, int b) {
        multiplication = a * b;
        return multiplication;
    }

    int division(int a, int b) {
        division = a / b;
        return division;
    }
}

class CalculatorTester{
    public static void main(String[] args) {
        Calculator2 calculator = new Calculator2(2, 2);
        calculator.add();
        calculator.setOperand1(10);
        substruction = calculator.substruction(3, 3);
        multiplication = calculator.multiplication(4, 7);
        division = calculator.division(70, 7);
    }
}



*/
