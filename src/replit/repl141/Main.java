package replit.repl141;
class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, -3, 7, 3, 22};
        System.out.println(maxValue(arr)); //should print 22
    }

    public static int maxValue(int[] myArr) {
        int max = myArr[0];//переменная мах равна елементу массива с индексом 0
        for (int i : myArr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

