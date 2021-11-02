package repl160;

class Main {
    static void display(int num){
        System.out.println(num);
    }
    static void display(String myString){
        System.out.println(myString);
    }
    static void display(double num){
        System.out.println(num);
    }
    public static void main(String[] args){
        display(100);
        display("Syntax Technologies");
        display(100.09);
    }
}

