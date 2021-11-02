package repl166;

public class Main {
        public static void main(String[] args){
            Animal obj=new Animal("Cat");
            obj.eat();
            obj.sleep();
            kitten1 obj1=new kitten1("kitten1");
            obj1.eat();
            obj1.sleep();
            kitten2 obj2=new kitten2("kitten2");
            obj2.eat();
            obj2.sleep();
            kitten3 obj3=new kitten3("kitten3");
            obj3.eat();
            obj3.sleep();
        }
    }
    class Animal{
        String type;
        Animal(String type){
            this.type=type;
        }
        void eat(){
            System.out.println(type+" eats");
        }
        void sleep(){
            System.out.println(type+" sleeps a lot");
        }
    }
    class kitten1 extends Animal{
        kitten1(String type){
            super(type);
        }
        void eat(){
            System.out.println(type+" eats milk");
        }
    }
    class kitten2 extends kitten1{
        kitten2(String type){
            super(type);
        }
        void eat(){
            System.out.println(type+" eats snacks");
        }
    }
   class kitten3 extends kitten2{
        kitten3(String type){
            super(type);
        }
        void eat(){
            System.out.println(type+" eats everything");
        }
    }


