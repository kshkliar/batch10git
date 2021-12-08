package andreyJava.homeworks.hw10;

public class TestTrip {
    public static void main(String[] args) {


        Trip trip1 = new Trip(20, Category.LUX, Departure.TASHKENT, Destination.KUTAISI,
                24, Speed.FAST);
        Trip trip2 = new Trip(22, Category.LUX, Departure.BAKU, Destination.TBILISI,
                24, Speed.FAST);
        Trip trip3 = new Trip(21, Category.SECOND_CLASS, Departure.POLTAVA, Destination.TBILISI,
                24, Speed.FAST);
        Trip trip4 = new Trip(25, Category.FIRST_CLASS, Departure.POLTAVA, Destination.BISHKEK,
                24, Speed.FAST);

        TripService ts = new TripService(10);
        ts.createTrip(trip1);
        ts.createTrip(trip2);
        ts.createTrip(trip3);
        ts.createTrip(trip4);
        System.out.println("-----");

        ts.watchAll(trip1);// я мог как угодно назвать аргумент класса Trip( в Gender -gender было соответствие)?

        System.out.println("-------\n------");

        ts.watchDeparture(Departure.POLTAVA);
        System.out.println("-----------------");
        trip1.viewTrip();//отдельный рейс

        ts.watchCategory(Category.LUX);//почему два одинаковых рейса вывелось на консоль?
    }
}
