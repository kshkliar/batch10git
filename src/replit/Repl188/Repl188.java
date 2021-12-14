package replit.Repl188;
/*Using Scanner class add 5 elements into ArrayList and then print all elements from
that ArrayList all in 1 line
Numbers in:
4
62
8
5
4
**Expected Output:**
4 62 8 5 4 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class Main {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }
        input.close();  // Good practice to save memory
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}

