package andreyJava.homeworks.hw18;

public class Array<T> {
    private T[] massive;

    public Array(T[] massive) {
        this.massive = massive;
    }

    public T get(int index) {
        return massive[index];
    }

    public int length() {
        return massive.length;
    }
}

class ArrayUtil {

    public static <T extends Number> double averageValue(Array<T> massive) {
        double sum = 0;

        for (int i = 0; i < massive.length(); i++) {
            sum += massive.get(i).doubleValue();

        }

        double avg = sum / massive.length();

        return avg;
    }
}
