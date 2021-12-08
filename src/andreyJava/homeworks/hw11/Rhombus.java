package andreyJava.homeworks.hw11;

public class Rhombus extends Figure {

    public Rhombus(double sideLength, double sideHeight) {
        super(sideLength, sideHeight);
    }

    @Override
    public void calculateSquare() {

        double area = getSideHeight() * getSideLength() / 2;

        System.out.println("Area of Rhombus is: " + area);

    }

    @Override
    public void print() {
        System.out.println("Rhombus");

    }
}

