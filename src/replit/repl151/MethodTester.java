package replit.repl151;

class MethodTester extends Methoda {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };//если статический метод то он не нуждаеться в полях
        System.out.println(Methoda.sun2D(a));// в качестве аргумента у метода массив a
        //над которым он проводит действие
    }
}

