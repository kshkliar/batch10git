package andreyJava.homeworks.hw15.task01;

public interface Fuelable {
    void fuel();
}

class Gasoline implements Fuelable {

    @Override
    public void fuel() {
        System.out.println("Fuel by gasoline");
    }
}

class Diesel implements Fuelable {

    @Override
    public void fuel() {
        System.out.println("Fuel by diesel");
    }
}
