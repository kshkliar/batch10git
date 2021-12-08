package andreyJava.homeworks.hw11;

public class Parallelogram extends Figure {

    public Parallelogram(double sideLength, double sideHeight) {
        super(sideLength, sideHeight);
    }

    @Override
    public void calculateSquare() {

        double area = getSideHeight() * getSideLength();

        System.out.println("Area of Parallelogram is: " + area);

    }

    @Override
    public void print() {
        System.out.println("Parallelogram");
    }
}
