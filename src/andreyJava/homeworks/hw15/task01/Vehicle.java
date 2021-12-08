package andreyJava.homeworks.hw15.task01;
/*Please model in classes domain described below.
    Using of interfaces, abstract classes & inheritances & abstract methods are highly recommended.
    //Exceptions needed as well.(не нужно)

    Vehicles. There are different kind of vehicles - cars, trucks, buses.
    Cars could be different kind as well - suv, racing car, compact car.

    Vehicle runs on some fuel - gasoline, diesel, electricity.
    Its possible to fuel car. If wrong fuel is used - car should break. (exception)

    All vehicles can do some actions: like accelerate or brake.

    Each and every vehicle has wheels. But trucks & buses has more wheels than cars.
    It should be possible to request number of wheels from car.

    P.S. BONUS - for implementing plug-in hybrid car: it runs on gasoline. But could also be charged by electricity.*/

public abstract class Vehicle implements Actinable {
    //String fuel;
    int wheels;
    private Fuel[] fuels;
    private Fuelable[] fuelables;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int countWheelsNum(Vehicle vehicle) {
        //     int count = 0;
        // if (vehicle.equals("Truk")||vehicle.equals("Bus")) {
        //      return;
        //      }
        //   }
        return 0;
    }
}
