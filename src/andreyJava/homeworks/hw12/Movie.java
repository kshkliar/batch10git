package andreyJava.homeworks.hw12;

/*Cоздать класс Фильм со свойствами: Название, Режиссер, длительность
(в минутах), количество актеров. Определить метод:
«Стоимость», возвращающую примерную расчетную стоимость фильма
(в тыс. $), рассчитываемую по формуле длительность*20 + количество
актеров*30, но если режиссер = «Стивен Спилберг» или «Джеймс
Кэмерон», то стоимость в два раза выше (по сравнению с вышеуказанной формулой). Определить также метод «Информация», который
возвращает строку, содержащую информацию о фильме: Название,
режиссера, длительность, количество актеров и стоимость.
Создать также класс наследник Мультфильм, в котором переопределить метод «Стоимость» по формуле длительность*25 + количество
актеров*10 (вне зависимости от режиссера).
В главной программе создать 2 фильма с
режиссерами: «Стивен Спилберг» и «Ежи Гофман», а также мультфильм и вывести информацию о них.*/
public class Movie {
    // где создавать методы здесь или отдельным классом, на чем остновываться?

    private String title;
    private String director;
    private double duration;
    private int numOfActors;

    public Movie(String title, String director, double duration, int numOfActors) {//double movieCost
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.numOfActors = numOfActors;
        //   this.movieCost = movieCost;
    }

    public double getDuration() {
        return duration;
    }

    public int getNumOfActors() {
        return numOfActors;
    }

    /* public double movieCosts(String director) {
             //   double costOfMovie = 0;
             if (director.equals("Spilberg") || director.equals("Kameron")) {
                 movieCost = ((duration * 20) + (numOfActors * 30)) * 2;
             } else {
                 movieCost = ((duration * 20) + (numOfActors * 30));

             }
             return movieCost;
         }*/
//return type -поменял со стринг на void
    public void displayinfo() {
        System.out.println("Title: " + title + " movie director - " + director +
                ", duration: " + duration + " number of actors " +
                numOfActors);// + " cost of movie: " + movieCost  -так не вышло
        //   return Displayinfo();
    }

    public double movieCosts() {//переделал на void c return сделать не вышло.

        double movieCost = (duration * 20) + (numOfActors * 30);

        if (director.equals("Spilberg") || director.equals("Kameron")) {
            movieCost *= 2;
        }

        return movieCost;
    }

    public void showCost() {
        System.out.println(movieCosts());
    }
}