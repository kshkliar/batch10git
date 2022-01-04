package andreyJava.lessons;

public class LearnGenerics {
    public static void main(String[] args) {
        Calculator<String> calculatorI = new Calculator<>("4", "8");
//        Calculator<Double> calculatorD = new Calculator<>(4.0, 8.0);

        CalculatorInt1 int1 = new CalculatorInt1();

        int1.<Double>sum(4.0);
    }
}

class CalculatorInt {
    private int value1;
    private int value2;
}

class CalculatorDouble {
    private double value1;
    private double value2;
}

class Calculator<T extends Comparable<T>> {
    private T value1;
    private T value2;

    public Calculator(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

}

class CalculatorInt1 {

    public <T extends Number> void sum(T t) {
        System.out.println(t);
    }

}

class CalculatorTwoGeneric<T, F> {
    private T value1;
    private F value2;

    public CalculatorTwoGeneric(T value1, F value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}
