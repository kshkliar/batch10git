package replit.repl159;

/*Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
In main method execute all 3 methods to match the output:
Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
```*/
class Maina {

    public void substruct(int num1, int num2, int num3, int num4) {
        int sum = num1 - num2 - num3 - num4;
        System.out.println(sum + " should be from subtracting 4 numbers");
    }

    public void substruct(int num1, int num2, int num3) {
        int sum = num1 - num2 - num3;
        System.out.println(sum + " should be from subtracting 3 numbers");
    }

    public void substruct(int num1, int num2) {
        int sum = num1 - num2;
        System.out.println(sum + " should be from subtracting 2 numbers");
    }

    public static void main(String[] args) {
        Maina obj = new Maina();
        obj.substruct(100, 40, 20);
        obj.substruct(100, 50, 10, 10);
        obj.substruct(100, 80);
    }
}

