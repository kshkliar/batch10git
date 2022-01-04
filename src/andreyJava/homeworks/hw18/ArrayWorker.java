package andreyJava.homeworks.hw18;

/*Create a generic class ArrayWorker with generic array field for working Integer and Double
Add code to counts the number of elements in each of arrays that are greater
than a specified element.*/
public class ArrayWorker<T extends Number> {

    private T[] array;

    public ArrayWorker(T[] array) {
        this.array = array;
    }

    public int countNum(T maxElem) {
        int count = 0;

        for (T t : array) {
            if (t.intValue() > maxElem.intValue()) {
                count++;
            }
        }

        return count;
    }
}