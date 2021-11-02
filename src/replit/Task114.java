package replit;

/* Create three methods that will accept 2 in parameters on integer type;
Step 2: Write the logic in method to perform action below:
The first method for multiplication
The second method for addition
The third method for subtraction;
Step 3: Execude all methods
for the addition method add two numbers to make 30
for multiplication - multiply two numbers to make 30
for Substruction - substruct two numbers to equal 20;
Expected output:
Addition 30;
Multiplication -30
Subtraction-20

 */
public class Task114 {
    public static void main(String[] args) {
        Task114 m =new Task114();
        System.out.println("Addition "+ m.addition(10,20)+ " ");
        System.out.println("Multiplication "+ m.multiplication(3, 10)+ " ");
        System.out.println("Substraction" +m.subtaction(30, 10)+ " ");

    }
    int multiplication(int a, int b) {
        return a*b;
    }

    int addition( int a, int b) {
        return a+b;
    }

    int subtaction(int a, int b){
        return a-b;
    }
}
