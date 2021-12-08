package andreyJava.homeworks.hw11;

public abstract class Figure implements Calculable {

    private double sideLength;// не могу сообразить как реализовать эти поля в своих классах не разрушая код
    private double sideHeight;

    public Figure(double sideLength, double sideHeight) {
        this.sideLength = sideLength;
        this.sideHeight = sideHeight;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getSideHeight() {
        return sideHeight;
    }
}
