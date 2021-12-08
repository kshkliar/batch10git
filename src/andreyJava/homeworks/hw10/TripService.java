package andreyJava.homeworks.hw10;

import java.util.Objects;

public class TripService {
    private Trip[] trips;

    public TripService(int numOfTrips) {
        trips = new Trip[numOfTrips];
    }
    //Создавать рейс(добавлять в массив):
    public void createTrip (Trip trip) {
        for (int i = 0; i < trips.length; i++) {
            if (Objects.isNull(trips[i])) {
                trips[i] = trip;
                break;
            }
        }
    }
    //Выводить список всех рейсов:
    public void watchAll(Trip trip) {
        for (Trip a : trips) {
            if (Objects.nonNull(a)) {
                // Выводить список рейсов по городу отбытия.
                a.viewTrip();
            }
        }
    }
   // Выводить список рейсов по городу отбытия/прибытия:
    public void watchDeparture(Departure departures) {
        for (Trip a : trips) {
            if (Objects.nonNull(a) && a.getDepartures().equals(departures)) {
                a.viewTrip();
            }
        }
    }
    // Выводить рейсы, у которых вагоны типа люкс/эконом.*/
    public void watchCategory(Category category) {//сюда получаеться любую переменную можно вставлять?
        for (Trip a : trips) {
            if (Objects.nonNull(a) && a.getCategory().equals(category)) {
                a.viewTrip();
            }
        }
    }
}

//не понял 4 момента -2 с предыдущего урока(ст 18,21) и 4-й в строке 12 как подавать в масив или список рейсы( trip)
//вопрос на строке 38