package replit.repl151;

class Main extends Method {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };//если статический метод то он не нуждаеться в полях
        System.out.println(Method.sum2d(a));//выводит сумму елементов

    }
}


