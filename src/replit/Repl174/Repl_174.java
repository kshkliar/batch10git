package Repl174;

class Main implements MyInterface {
    public void method1(){
        System.out.println("implementation of method1");
    }
    public void method2(){
        System.out.println("implementation of method2");
    }
    public static void main(String[] args){
        Main obj=new Main();
        obj.method1();
        obj.method2();
    }
}