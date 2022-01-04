package andreyJava.homeworks.hw18;

public class ArrayTester {
    public static void main(String[] args) {
        Double[] arr = {2.2, 3.2, 4.1, 5.6};

        Array<Double> array = new Array<>(arr);

        double avg = ArrayUtil.<Double>averageValue(array);

        System.out.println(avg);
    }
}
