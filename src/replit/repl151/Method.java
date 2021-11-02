package repl151;

class Method{
    static int sum2d(int[][] a){
        int sum=0;
        for(int[] i:a){
            for(int j : i){
                sum+=j;
            }
        }
        return sum;
    }
}