package replit;
/* Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."
The second method should be a static method that print out the following message:
"Java is awesome."
Execute Output:
Programming is amazing.
Java is awesome.
 */


public class Task127 {
    void m1(){  //можем вызвать создавая объект класса
        System.out.println("Programming is amazing.");

    }
    static void m2(){  // можем без создания объекта
        System.out.println("Java is awesome");

    }

    public static void main(String[] args) {
        Task127 m = new Task127();
        m.m1();
        m2();
    }
}
