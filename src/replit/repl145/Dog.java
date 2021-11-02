package repl145;

public class Dog {
    String dogName;
    double dogWeight;
    static String dogBreed="Mutt";

    Dog(String dogName,double dogWeight){
        this.dogName=dogName;
        this.dogWeight=dogWeight;
    }
    void Display(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }
}
