package andreyJava.homeworks.hw10;

/*Организовать приложение касса вокзала.
Приложение должно позволять:
1) Создавать рейс(количество вагонов, класс удобства(использовать enum),
город отбытия/прибытия(использовать enum), время в пути, скоростной/нескоростной).
2) Выводить список всех рейсов.
3) Выводить список рейсов по городу отбытия/прибытия.
4) Просматривать отдельный рейс.
5) Выводить рейсы, у которых вагоны типа люкс/эконом.*/
public class Trip {
    private int wagonsNum;
    private Category facilities;
    private Departure departures;
    private Destination destination;
    private double travelTime;
    private Speed tripType;

    public Trip(int wagonsNum, Category facilities, Departure departures, Destination destination, double travelTime, Speed tripType) {
        this.wagonsNum = wagonsNum;
        this.facilities = facilities;
        this.departures = departures;
        this.destination = destination;
        this.travelTime = travelTime;
        this.tripType = tripType;
    }

    public Category getCategory() {
        return facilities;
    }

    public Departure getDepartures() {
        return departures;
    }

    public void viewTrip() {
        System.out.println("Number of wagons " + wagonsNum +
                " Class " + facilities +
                " departs from " + departures +
                " arrives to " + destination +
                " travel time is " + travelTime + ":" +
                " " + tripType + " train");
    }
}
