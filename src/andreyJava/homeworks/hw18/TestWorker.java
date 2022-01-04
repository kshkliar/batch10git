package andreyJava.homeworks.hw18;

public class TestWorker {
    public static void main(String[] args) {

        Integer[] arr = {1, 5, 8, 9, 2};
        Double[] arr2 = {1.0, 5.6, 8.8, 9.9, 2.7};

        ArrayWorker<Integer> workerInt = new ArrayWorker<>(arr);
        ArrayWorker<Double> workerDouble = new ArrayWorker<>(arr2);

        System.out.println(workerInt.countNum(4));
        System.out.println(workerDouble.countNum(7.9));
    }
}
