package andreyJava.homeworks.hw12;

public class Cartoon extends Movie {


    public Cartoon(String title, String director, double duration, int numOfActors) {
        super(title, director, duration, numOfActors);
    }

    //(почему нету тега Override)?
    public double movieCosts() {//return type поменял на void
        return (getDuration() * 25) + (getNumOfActors() * 10);
    }

}

