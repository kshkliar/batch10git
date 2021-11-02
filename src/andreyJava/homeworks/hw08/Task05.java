package andreyJava.homeworks.hw08;

/*Count chars of strings placed in the odd positions in the given array. For example: array =
["Hello", "world", "from", "array"]
   the result will be 9: "Hello" length is 5 and "from" length is 4
   "world" and "array" are skipped because they are on the even positions.*/
public class Task05 {

   /* public static void main(String[] args) {

        String[] arr = {"Hello", "world", "from", "array"};
        for (int i = 0; i < arr.length; i += 2)


            System.out.print(arr[i] + " ");
*/

    public static int countOddPositionChars(String[] arr) {

        int count = 0;

        int arrSize = arr.length;

        for (int i = 1; i < arrSize; i += 2) {
            count += arr[i].length();
        }

        return count;
    }

    public static void main(String[] args) {
//        String[] arr = {"Hello", "world", "from", "array"};
        String[] arr = {"Hello world from array"};

        int num = countOddPositionChars(arr);
        System.out.println(num);
    }
}
