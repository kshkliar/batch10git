package replit;
/* Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."//можем вызвать создавая объект класса
The second method should be a static method that print out the following message:
"Java is awesome."// можем без создания объекта
Execute Output:
Programming is amazing.
Java is awesome.
 */


public class Task127a {


    void print1(){//называем глаголом
        System.out.println("Programming is amazing");
    }

    static void print2() {
        System.out.println("Java is awesome");
    }


    public static void main(String[] args) {
        Task127a m1=new Task127a();
        m1.print1(); //вызываем метод который напечатает то что содержиться
        // в методе через экземпляр класса
        print2();//вызываем метод который не требует обьекта
    }




}
