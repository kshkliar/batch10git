package andreyJava.homeworks.hw18;
/* Create class MyTestMethod with generic static method calcNum
(with two parameters: an array T[] and
variable maxElem of type T) that counts the number of elements in
an array T[] that are greater than a specified element maxElem.*/

public class MyTestMethod {

    public static <T extends  Number> int calcNum(T[] array, T maxElem) {
        int count = 0;

        for (T t : array) {
            if (t.intValue() > maxElem.intValue()) {
                count++;
            }
        }

        return count;
    }
}
