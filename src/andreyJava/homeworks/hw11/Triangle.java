package andreyJava.homeworks.hw11;

public class Triangle implements Calculable {
    @Override
    public void calculateSquare() {

        double b = 2.5;
        double h = 5;
        double area = (b * h) / 2;

        System.out.println("Area of Triangle is: " + area);
    }

    @Override
    public void print() {//без параметров выдавал ошибку
        //Calculable.super.print(triangle);
        System.out.println("Triangle");
    }
}
