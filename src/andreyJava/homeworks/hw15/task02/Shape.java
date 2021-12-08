package andreyJava.homeworks.hw15.task02;

/* Please create an abstarct class Shape and two subclasses Square and Circle.
Replace code in method drawShape()
according to principles of polymorphism.
Please propose the other solutions for improving quality of the code.*/
abstract class Shape {

    private ShareType shareType;

    //other fields


    public Shape(ShareType shareType) {
        this.shareType = shareType;
    }

    public ShareType getShareType() {
        return shareType;
    }

    //этот метод нужно улучшить:( берет фигуру сравнивает ее с квадратом (enam) и если совпадает рисует
    public abstract void drawShape();


   /* public boolean drawShape() {
        return
    }*/

    //others methods
}