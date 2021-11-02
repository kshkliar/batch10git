package replit.Repl210;
/*Complete the code, handle possible exception
**Expected Output:**
/ by zero
```*/
class Main {
    public static void main(String[] args) {
        int a=10, b=0, result;
        try {
            result = a / b;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}