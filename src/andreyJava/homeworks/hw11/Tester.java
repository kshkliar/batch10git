package andreyJava.homeworks.hw11;

public class Tester {
    public static void main(String[] args) {


        Triangle triangle = new Triangle();
        triangle.calculateSquare();
        //  triangle.print("Triangle");//что-то тут не то
        triangle.print();

        Rhombus rhombus = new Rhombus(12, 15);
        rhombus.calculateSquare();
        //  rhombus.print("");// и тут
        rhombus.print();

        Parallelogram parallelogram = new Parallelogram(10, 11);
        parallelogram.calculateSquare();
        //parallelogram.print(parallelogram);
        parallelogram.print();

    }
}